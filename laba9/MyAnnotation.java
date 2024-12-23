package org.example;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;

public class MyAnnotation {

    public static void createTable(Object obj) throws SQLException {
        Table table = obj.getClass().getAnnotation(Table.class);
        // sql запрос для создания таблицы
        StringBuilder sql = new StringBuilder("CREATE TABLE " + table.title() + " (");
        // sql запрос для удаления таблицы
        StringBuilder sqlDEL = new StringBuilder("DROP TABLE IF EXISTS " + table.title() + ";");
        Field[] fields = obj.getClass().getDeclaredFields();


        for (Field field : fields) {
            // Проверяем наличие аннотации Column у поля
            if (field.isAnnotationPresent(Column.class)) {
                sql.append(field.getName()).append(" ");
                // Определяем тип поля
                if (field.getType().getSimpleName().equals("int")) {
                    sql.append("INTEGER");
                }
                else {
                    sql.append("TEXT");
                }
                sql.append(",");
            }
        }
        sql.deleteCharAt(sql.length() - 1);
        sql.append(");");
        //================================================
        Connection connection = null;
        try{
            connection = DriverManager.getConnection("jdbc:sqlite:identifier.sqlite");
            Statement statement = connection.createStatement();
            // Выполняем запрос на удаление таблицы (если существует)
            statement.execute(sqlDEL.toString());
            // Выполняем запрос на создание таблицы
            statement.execute(sql.toString());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if(connection!=null) {
                connection.close();
            }

        }
    }
    public static void insertIntoTable(Object obj) throws SQLException {
        // sql запрос для вставки в таблицу
        String tableName = obj.getClass().getAnnotation(Table.class).title();
        // получаем все поля класса объекта
        Field[] fields = obj.getClass().getDeclaredFields();
        StringBuilder query = new StringBuilder("INSERT INTO " + tableName + " (");
        for (Field field : fields) {
            // Проверяем наличие аннотации Column у поля
            if (field.isAnnotationPresent(Column.class)) {
                query.append(field.getName()).append(",");
            }
        }
        query.deleteCharAt(query.length() - 1).append(") VALUES (");
        for (Field field : fields) {
            // Проверяем наличие аннотации Column у поля
            if (field.isAnnotationPresent(Column.class)) {
                field.setAccessible(true);
                try {
                    query.append("'").append(field.get(obj)).append("',");
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        query.deleteCharAt(query.length() - 1).append(")");
        Connection connection = null;
        try{
            connection = DriverManager.getConnection("jdbc:sqlite:identifier.sqlite");
            Statement statement = connection.createStatement();
            // Выполняем запрос на вставку данных в таблицу
            statement.execute(query.toString());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if(connection!=null) {
                connection.close();
            }

        }
    }
}