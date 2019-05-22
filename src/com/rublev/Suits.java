package com.rublev;

public enum Suits {
  CLUBS("CLUBS"),
  DIAMONDS("DIAMONDS"),
  HEARTS("HEARTS"),
  SPADES("SPADES");

  private String title;

    Suits(String title) {
      this.title = title;
    }

    public String getTitle() {
      return this.title;
    }
  
}
