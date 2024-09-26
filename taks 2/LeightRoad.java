package org.example;

public enum LeightRoad {
    LOW("Короткая дистанция", 1), MEDIUM("Средняя дистанция",250), HEIGHT("Длинная дистанция",50000);
    private String title;
    private int lenght;
    LeightRoad(String title, int lenght)
    {
        this.title =title;
        this.lenght = lenght;
    }
    public String getTitle()
    {
        return title;
    }
    public int getLenght(){
        return lenght;
    }
}
