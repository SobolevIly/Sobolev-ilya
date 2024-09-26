package org.example;

import java.awt.*;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


      Animal[] animals = {new Cat("Мурзик ",150),
              new Tiger("тигр",43,54),
              new Dog("Бобик ",332 ,54),
              new Mussel("Мидия",0),
              new Snale("Улитка",10 ,4),
              new Octopus("Осьминог",0 ,1000)};

      for (Animal a:animals){
          a.run( 100);
          a.swim( 100);
      }
        for (int i = 3; i < 6; i++) {
            ((Shellfish) animals[i]).uniqueness();
        }

        new Snale("Улитка",10 ,4);
        new Snale("Улитка",10 ,4);
        new Snale("Улитка",10 ,4);
        System.out.println("Мидий : " + Mussel.count);
        System.out.println("Улиток : " + Snale.count);
        System.out.println("Осьминогов : " + Octopus.count);
        System.out.println("Всего животных : " + Animal.count);
    }

}