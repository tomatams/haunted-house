package com.codecool.update.Monster;

import com.codecool.update.BaseMonster;
import com.codecool.update.Guest;

public class Demon implements BaseMonster {

    private final String name = "randomDemon";
    private int healthLevel = -10;
    private int scaredLevel =  7;

    @Override
    public boolean scare(Guest guest) {
        guest.setHealthLevel(guest.getHealthLevel() + healthLevel);
        guest.setScaredLevel(guest.getScaredLevel() + scaredLevel);
        return true;
    }
    @Override
    public String getName() {
        return name;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public void setHealthLevel(int healthLevel) {
        this.healthLevel = healthLevel;
    }

    public int getScaredLevel() {
        return scaredLevel;
    }

    public void setScaredLevel(int scaredLevel) {
        this.scaredLevel = scaredLevel;
    }
}
