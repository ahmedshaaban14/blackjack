/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

/**
 *
 * @author Administrator
 */
public class Card {
   private  int suit ;
   private  int rank  ;
   private int  value ;

    public Card(int suit, int rank, int value) {
        this.suit = suit;
        this.rank = rank;
        this.value = value;
    }
    public  Card (Card card)
    {
        this.suit= card.suit;
        this.rank = card.rank;
        this.value = card.value;
        
    }

    public int getSuit() {
        return suit;
    }

   

    public int getRank() {
        return rank;
    }


    public int getValue() {
        return value;
    }

  

}

 


