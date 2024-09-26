package org.example;

public class Treadmill implements Let {
    String name;

    public Treadmill(LeightRoad roadLenght) {
        this.name = roadLenght.getTitle();
        this.roadLenght = roadLenght.getLenght();
    }

    int roadLenght;

    @Override
    public boolean isCan(Participant participant) {
        return participant.run(roadLenght);
    }
}
