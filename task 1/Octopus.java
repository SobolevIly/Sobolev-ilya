package org.example;

public class Octopus extends Shellfish{
    public static final String feature = "У него много щупалец  ";
    public static int count = 0;
    public Octopus(String name, int maxRunDist, int maxSwimDist) {
        super(name, maxRunDist, maxSwimDist,feature);
        count++;
    }
}
