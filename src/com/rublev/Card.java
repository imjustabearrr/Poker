package com.rublev;


import java.util.HashMap;
import java.util.Map;

final class Card {

  private String suit;
  private Integer rank;

  Card(String suit, Integer rank) {
    this.suit = Suits.valueOf(suit).getTitle();
    this.rank = Ranks.valueOf(getRanks().get(rank)).getRank();
  }

  String getSuit() {
    return this.suit;
  }

  Integer getRank() {
    return this.rank;
  }

  private Map<Integer, String> getRanks() {
    Map<Integer, String> ranks = new HashMap<>();
    ranks.put(2, "TWO");
    ranks.put(3, "THREE");
    ranks.put(4, "FOUR");
    ranks.put(5, "FIVE");
    ranks.put(6, "SIX");
    ranks.put(7, "SEVEN");
    ranks.put(8, "EIGHT");
    ranks.put(9, "NINE");
    ranks.put(10, "TEN");
    ranks.put(11, "JACK");
    ranks.put(12, "QUEEN");
    ranks.put(13, "KING");
    ranks.put(14, "ACE");
    return ranks;
  }
}