package org.example;
public class Mussel extends Shellfish{

    public static int count = 0;
    public static final String feature = "очень вкусная";
    public Mussel(String name, int maxSwimDist) {
        super(name,0, maxSwimDist,feature);
        count++;


    }
}

