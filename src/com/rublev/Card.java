package com.rublev;


import java.util.HashMap;
import java.util.Map;

final class Card {

  private String suit;
  private String rank;

  Card(String suit, Integer rank) {
    this.suit = Suits.valueOf(suit).getTitle();
    this.rank = getRanks().get(rank);
  }

  String getSuit() {
    return this.suit;
  }

  String getRank() {
    return this.rank;
  }

  private Map<Integer, String> getRanks() {
    Map<Integer, String> ranks = new HashMap<>();
    ranks.put(2, "two");
    ranks.put(3, "three");
    ranks.put(4, "four");
    ranks.put(5, "five");
    ranks.put(6, "six");
    ranks.put(7, "seven");
    ranks.put(8, "eight");
    ranks.put(9, "nine");
    ranks.put(10, "ten");
    ranks.put(11, "jack");
    ranks.put(12, "queen");
    ranks.put(13, "king");
    ranks.put(14, "ace");
    return ranks;
  }
}