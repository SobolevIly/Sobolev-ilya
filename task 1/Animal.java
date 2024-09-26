package org.example;

public class Animal {
    protected String name;
    private int maxRunDist;
    private int maxSwimDist;
    static int count;

    public Animal(String name,int maxRunDist,int  maxSwimDist) {
        this.name = name;
        this.maxRunDist = maxRunDist;
        this.maxSwimDist = maxSwimDist;
        count++;
    }

    public String getName() {
        return name;
    }


    public void run(int dist) {
        if (dist <= this.maxRunDist) {
            System.out.println((this.name + "пробежал" + dist));
        } else {
            System.out.println((this.name + " не пробежал" + dist));
        }
    }

    public void swim(int swimDist) {
        if (swimDist <= this.maxSwimDist) {
            System.out.println((this.name + "проплыл" + swimDist));
        } else {
            System.out.println((this.name + " не проплыл" + swimDist));
        }
    }


}

