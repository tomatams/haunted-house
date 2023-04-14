package com.codecool;

import com.codecool.update.BaseMonster;
import com.codecool.update.Guest;
import com.codecool.update.HauntedHouse;
import com.codecool.update.Monster.Demon;
import com.codecool.update.Monster.Ghost;
import com.codecool.update.Monster.Vampire;

import java.util.ArrayList;
import java.util.List;

public class UpdateMain {
    public static void main(String[] args) {
        List<Guest> guestsList = new ArrayList<>();
        List<BaseMonster> monsterList= new ArrayList<>();
        guestsList.add(new Guest("Lajos"));
        guestsList.add(new Guest("Mary"));
        guestsList.add(new Guest("Janos"));
        guestsList.add(new Guest("Dia"));
        guestsList.add(new Guest("Circa"));
        monsterList.add(new Demon());
        monsterList.add(new Ghost());
        monsterList.add(new Vampire());

        HauntedHouse hauntedHouse = new HauntedHouse(guestsList, monsterList);
        hauntedHouse.startHaunting(4);
    }
}
