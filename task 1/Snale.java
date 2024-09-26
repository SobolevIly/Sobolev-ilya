package org.example;

public class Snale extends Shellfish{
    public static final String feature = "очень медленная  ";
    public static int count = 0;
    public Snale(String name,int maxRunDist, int maxSwimDist) {
        super(name, maxRunDist, maxSwimDist,feature);
        count++;
    }
}
