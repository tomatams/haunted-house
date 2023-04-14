package com.codecool.update;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HauntedHouse {
    private List<Guest> guestList;
    private List<BaseMonster> monsterList;
    private Random random;

    public HauntedHouse(List<Guest> guestList, List<BaseMonster> monsterList) {
        this.guestList = guestList;
        this.monsterList = monsterList;
        this.random = new Random();
    }

    public void startHaunting(int circle){
        int guestNumber = 0;
        List<Guest> leavingGuests = new ArrayList<>();
        for (int i = 0; i < circle; i++){
            // each guest should be scared by a random monster selected from the monsterList
            while (guestNumber != guestList.size()){
                int randomNumber = random.nextInt(monsterList.size());
                Guest actualGuest = guestList.get(guestNumber);
                executeScare(leavingGuests, randomNumber, actualGuest);
                guestNumber++;
            }
            guestNumber = 0;
        }
        // if it gets too scary for a guest, remove the guest from the list
        removeLeavingGuestFromGuestsList(leavingGuests);
    }

    private void removeLeavingGuestFromGuestsList(List<Guest> leavingGuests) {
        for (Guest guest : leavingGuests) {
            guestList.remove(guest);
        }
        System.out.println("The hotel have: " + guestList.size() + " guests left");
    }

    private void executeScare(List<Guest> leavingGuests, int randomNumber, Guest actualGuest) {
        monsterList.get(randomNumber).scare(actualGuest);
        System.out.println(actualGuest.getName() + " was scared by: " +
                monsterList.get(randomNumber).getName());
        if (actualGuest.isTooScared()){
            leavingGuests.add(actualGuest);
            System.out.println(actualGuest.getName() + " was leaving the hotel because of monsters!");
        }
        ;
    }

    public List<Guest> getGuestList() {
        return guestList;
    }

    public void setGuestList(List<Guest> guestList) {
        this.guestList = guestList;
    }

    public List<BaseMonster> getMonsterList() {
        return monsterList;
    }

    public void setMonsterList(List<BaseMonster> monsterList) {
        this.monsterList = monsterList;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }
}
