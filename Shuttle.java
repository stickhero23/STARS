/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.main.java.com.skw.stars.system;

/**
 *
 * @author user
 */
public class Shuttle {

    private String journeyCode;
    private World fromWorld;
    private World destinationWorld;
    private Card card;
    private int journeyCredits;

    public String getJourneyCode() {
        return journeyCode;
    }

    public void setJourneyCode(String journeyCode) {
        this.journeyCode = journeyCode;
    }

    public World getFromWorld() {
        return fromWorld;
    }

    public void setFromWorld(World fromWorld) {
        this.fromWorld = fromWorld;
    }

    public World getDestinationWorld() {
        return destinationWorld;
    }

    public void setDestinationWorld(World destinationWorld) {
        this.destinationWorld = destinationWorld;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public Shuttle(String journeyCode, World fromWorld, World destinationWorld, Card card) {
        this.journeyCode = journeyCode;
        this.fromWorld = fromWorld;
        this.destinationWorld = destinationWorld;
        this.card = card;
    }

    public boolean canCardTravel() {
        if (!destinationWorld.isWorldFull()) {
            if (card.getRating() <= destinationWorld.getRating()) {

                if (card.getCredit() >= journeyCredits) {
                    return true;
                } else {
                    //Insufficient Credits
                    return false;
                }
            } else {
                //Insufficient Destination Ratings
                return false;
            }
        } else {
            //The destination world is full
            return false;
        }
    }

    public String checkTravellingCard() {
        if (!destinationWorld.isWorldFull()) {
            if (card.getRating() <= destinationWorld.getRating()) {

                if (card.getCredit() >= journeyCredits) {
                    return "Successful Travel standards";
                } else {
                    //Insufficient Credits
                    return "Insufficient Credits for th journey";
                }
            } else {
                //Insufficient Destination Ratings
                return "Insufficient Destination Ratings";
            }
        } else {
            //The destination world is full
            return "The destination world is full";
        }
    }

    @Override
    public String toString() {
        return "Shuttle{" + "journeyCode=" + journeyCode + ", fromWorld=" + fromWorld + ", destinationWorld=" + destinationWorld + ", card ID=" + card.getCardId()+ ", card Name=" + card.getName() + ", journeyCredits=" + journeyCredits + '}';
    }
    
    
    
}
