package org.example;

public class Wall implements Let {
    private int wallHeight;

    public Wall(HeightWall wallHeight) {
        this.height = wallHeight.getHeight();
        this.title = wallHeight.getTitle();
    }

    int height;
    String title;

    @Override
    public boolean isCan(Participant participant) {
        return participant.jump(height);
    }


}
