package org.example;

public class MyArrayDateException extends  RuntimeException{
    private int i;
    private int j;
    private String s;
    public MyArrayDateException(int i, int j, String s){
        super("Неправильное знач в массиве " + " Некорректный символ " + s + " Ошибка в ячейке " + (i + 1) + " x " + (j+1));
        this.i = i;
        this.j = j;
        this.s = s;
    }
}
