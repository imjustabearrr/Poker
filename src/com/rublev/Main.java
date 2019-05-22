package com.rublev;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    final int deckRank = 13;
    List<Card> deck = new ArrayList();
    for (int i = 2; i <= deckRank; i++) {
      deck.add(new Card("CLUBS", i));
      deck.add(new Card("DIAMONDS", i));
      deck.add(new Card("HEARTS", i));
      deck.add(new Card("SPADES", i));
    }

    for (Card card : deck) {
      System.out.print(card.getRank() + " ");
      System.out.println(card.getSuit());
      System.out.println("*********");
    }




  }
}
