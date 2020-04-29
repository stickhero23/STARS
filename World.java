/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.main.java.com.skw.stars.system;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class World {

    private int worldId;
    private String worldName;
    private int rating;
    private int capacity;
    private ArrayList<Card> inWorldCards;

    public int getWorldId() {
        return worldId;
    }

    public void setWorldId(int worldId) {
        this.worldId = worldId;
    }

    public String getWorldName() {
        return worldName;
    }

    public void setWorldName(String worldName) {
        this.worldName = worldName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ArrayList<Card> getInWorldCards() {
        return inWorldCards;
    }

    public void setInWorldCards(ArrayList<Card> inWorldCards) {
        this.inWorldCards = inWorldCards;
    }

    public World(int worldId, String worldName, int rating, int capacity, ArrayList<Card> inWorldCards) {
        this.worldId = worldId;
        this.worldName = worldName;
        this.rating = rating;
        this.capacity = capacity;
        this.inWorldCards = inWorldCards;
    }

    public void enter(Card card) {
        inWorldCards.add(card);
    }

    public void leave(Card card) {
        int i = 0;
        while (i < inWorldCards.size()) {
            Card tempCard = inWorldCards.get(i);
            if (tempCard.getCardId() == card.getCardId()) {
                inWorldCards.remove(i);
                return;
            }
            i++;
        }
    }

    public boolean isWorldFull(){
        if(inWorldCards.size()<capacity){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean isCardInWorld(Card card){
        for(Card car : inWorldCards){
            if(car.getCardId() == car.getCardId()){
                return true;
            }
        }
        return false;
    }
    
}
