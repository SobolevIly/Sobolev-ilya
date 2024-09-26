package org.example;

import jdk.dynalink.beans.StaticClass;

public class Cat extends Animal {
    public static int count = 0;
    private static final int catMaxSwimDist = 0;

    public Cat(String name,int maxRunDinst) {
        super(name,maxRunDinst, catMaxSwimDist);
        count++;
    }
}
