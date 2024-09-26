package org.example;

public abstract class Shellfish extends Animal {

    public static int count = 0;
    public String feature;
    public Shellfish(String name,int  maxRunDist, int maxSwimDist, String feature) {
        super(name,maxRunDist, maxSwimDist);
        this.name = name;
        this.feature = feature;
        count++;
}
    public void uniqueness()
    {
        System.out.println("эксклюзивность " + this.name + " - " + this.feature );
    }


}
