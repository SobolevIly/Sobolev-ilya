package org.example;
import java.util.Map;
import java.util.HashMap;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] words = {" папа ", " мама ", " машина ", " мама "," папа "," школа ", " собака ", " мама ", " мама ", " мама ", " мама "};
            HashMap<String, Integer> listwords = new HashMap<String, Integer>();
        for (String s : words) {
            listwords.put(s, listwords.getOrDefault(s, 0) + 1);
        }
        System.out.println(listwords.entrySet());
        Interpreter d = new Interpreter();
        d.add("город", "city");
        d.add("город", "town");
        d.add("город", "borough");

        d.add("дом", "home");
        d.add("дом", "building");
        d.add("дом", "house");

        d.add("поиск", "search");
        d.add("поиск", "seek");
        d.add("мама", "mom");

        d.add("мама", "mother");
        d.add("сити","city");

        d.get("город");
        d.printAll();
}}