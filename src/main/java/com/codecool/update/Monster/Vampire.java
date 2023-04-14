package com.codecool.update.Monster;

import com.codecool.update.BaseMonster;
import com.codecool.update.Guest;

public class Vampire implements BaseMonster {
    private final String name = "randomVampire";
    private int energyLevel =  -40;
    @Override
    public boolean scare(Guest guest) {
        guest.setEnergyLevel(guest.getEnergyLevel() + energyLevel);
        return true;
    }
    @Override
    public String getName() {
        return name;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }

    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }
}
