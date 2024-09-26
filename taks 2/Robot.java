package org.example;

public class Robot implements Participant {
    private int maxHight;
    private int maxLenght;
    String name;

    public Robot(int maxHight, int maxLenght, String name) {
        this.maxHight = maxHight;
        this.maxLenght = maxLenght;
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public int getMaxLenght() {
        return maxLenght;
    }

    @Override
    public boolean run(int dist) {
        if (dist <= maxLenght) {
            System.out.println(this.name + " пробежал " + dist + "м");
            return true;
        } else {
            System.out.println(this.name + " не пробежал " + dist + "м");
            return false;
        }
    }
    @Override
    public boolean jump(int height) {
        if (height <= maxHight) {
            System.out.println(this.name + " перепрыгнул " + height + "м");
            return true;
        } else {
            System.out.println(this.name + " не перепрыгнул " + height + "м");
            return false;
        }
    }
}
