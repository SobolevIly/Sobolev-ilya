package org.example;

public class Dog extends Animal {
    public static int count = 0;
    public Dog(String name,int maxRunDinst, int maxSwimDist) {
        super(name, maxRunDinst, maxSwimDist);
        count++;
    }
}