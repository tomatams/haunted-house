package com.codecool.update.Monster;

import com.codecool.update.BaseMonster;
import com.codecool.update.Guest;

public class Ghost implements BaseMonster {
    private final String name = "randomGhost";
    private int scaredLevel =  33;
    @Override
    public boolean scare(Guest guest) {
        guest.setScaredLevel(guest.getScaredLevel() + scaredLevel);
        return true;
    }
    @Override
    public String getName() {
        return name;
    }

    public int getScaredLevel() {
        return scaredLevel;
    }

    public void setScaredLevel(int scaredLevel) {
        this.scaredLevel = scaredLevel;
    }
}
