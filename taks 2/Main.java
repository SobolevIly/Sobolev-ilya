package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Participant[] participants = {
                new Cat(30000,1000,"вася"),
                new Cat(3,1,"игорь"),
                new Human(5,644,"маша"),
                new Robot(100,100,"робот"),

        };
        Let[] lets =
                {
                        new Treadmill(LeightRoad.LOW),
                       // new Wall(HeightWall.HIGHT),
                        new Treadmill(LeightRoad.HEIGHT),
                        new Treadmill(LeightRoad.HEIGHT),
                        new Treadmill(LeightRoad.HEIGHT),
                        new Wall(HeightWall.LOW),
                        new Wall(HeightWall.MEDIUM),
                        new Wall(HeightWall.HIGHT)
                };
        for(Participant i: participants)
        {
            for (Let n : lets)
            {
                if(!n.isCan(i))
                    break;;
            }
        }

    }
}