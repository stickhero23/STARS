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
public class Card {
    
    private int cardId;
    private String name;
    private int rating;
    private int credit;
    private int loyaltyPoints;

    public int getCardId() {
        return cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public void setLoyaltyPoints(int loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
    }

    public Card(int cardId, String name, int rating, int credit, int loyaltyPoints) {
        this.cardId = cardId;
        this.name = name;
        this.rating = rating;
        this.credit = credit;
        this.loyaltyPoints = loyaltyPoints;
    }
    
    //Charge credits when boarding a shuttle
    public void chargeCredit(int creditCharge){
        setCredit(getCredit() - creditCharge);
    }
    
    //To up your credits
    public void topUpCredit(int creditTopUp){
        setCredit(getCredit() + creditTopUp);
    }
    
    //Redeem points for credit
    public void redeemLoyaltyPoints(){
        //One Credit is equal to 4 Loyalty Points
        
        //Check for enough points to redeem without remainder
        int remainderPoints = getLoyaltyPoints()%4;
        
        int convertingLoyaltyPoints = getLoyaltyPoints() - remainderPoints;
        int credits = convertingLoyaltyPoints / 4;
        setCredit(credits);
    }
    
    public boolean isCreditSufficient(int creditRequirement){
        if(getCredit()<creditRequirement){
            return false;
        }else{
            return true;
        }
    }
    
    public void earnPoints(int creditConsumed){
        //What is the equivalent of one point earned per credit
    }

    @Override
    public String toString() {
        return "Card{" + "name=" + name + ", rating=" + rating + ", credit=" + credit + ", loyaltyPoints=" + loyaltyPoints + '}';
    }

}
