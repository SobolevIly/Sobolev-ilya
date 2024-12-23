package org.example;


public class Main {
    public static void main(String[] args) throws Exception {
        Snail Snail1 = new Snail("Илья", 12,  20.5, Snail.feature.Vinogradnaya);
        Snail Snail2 = new Snail("Игорь", 11, 234, Snail.feature.Delicious);
        Snail Snail3 = new Snail("Леха", 3, 443, Snail.feature.Slow);
        Snail Snail4 = new Snail("МАтвейка_золик_2004", 3, 443, Snail.feature.Vinogradnaya);
        MyAnnotation.createTable(Snail1);
        MyAnnotation.insertIntoTable(Snail1);
        MyAnnotation.insertIntoTable(Snail2);
        MyAnnotation.insertIntoTable(Snail3);
        MyAnnotation.insertIntoTable(Snail4);

    }
}