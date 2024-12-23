package org.example;

@Table(title = "Snail")
public class Snail {
    public enum feature {
        Delicious, Slow, Vinogradnaya;
        public String feature() {
            return this.toString();
        }
    }
     @Column
    private String name;

    //@Column
    private int age;

    @Column
    private double maxRunDistance;

    @Column
    private feature feature;

    public Snail(String name, int age, double maxRunDistance, feature feature) {
        this.name = name;
        this.age = age;
        this.maxRunDistance = maxRunDistance;
        this.feature = feature;
    }


}