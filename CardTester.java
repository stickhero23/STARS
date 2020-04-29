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
public class CardTester {

    private ArrayList<Card> cardsList;

    public ArrayList<Card> getCardsList() {
        return cardsList;
    }

    public void setCardsList(ArrayList<Card> cardsList) {
        this.cardsList = cardsList;
    }

    public CardTester() {
        this.cardsList = new ArrayList<>();
    }

    //int cardId, String name, int rating, int credit, int loyaltyPoints
    public void addCard(int cardId, String name, int rating, int credit) {
        Card card = new Card(cardId, name, rating, credit, 0);
        this.cardsList.add(card);
    }

    public void chargeCredit(Card card) {
        if (card.isCreditSufficient(10)) {
            card.chargeCredit(10);
        }
        System.out.println(card.toString());
    }

}
