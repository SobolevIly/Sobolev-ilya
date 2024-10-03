package org.example;

public class MyHappyExceptioin extends RuntimeException {
    private int i;
    private int j;
    private String s;
    public MyHappyExceptioin(int i, int j, String s){
        super(" Найдено счастливое число "  + s + " Место ячейки " + (i + 1) + " x " + (j+1));
        this.i = i;
        this.j = j;
        this.s = s;
    }
}
