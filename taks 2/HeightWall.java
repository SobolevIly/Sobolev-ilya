package org.example;

public enum HeightWall {
    LOW("Маленькая",3), MEDIUM("Средняя", 7), HIGHT("Высокая", 1000);
    private String title;
    private int height;
    HeightWall(String title, int height)
    {
        this.title = title;
        this.height = height;
    }
    public String getTitle() {return title;}
    public int getHeight() { return height;}
}
