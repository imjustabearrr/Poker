package com.rublev;

public enum Ranks {
  TWO(2),
  THREE(3),
  FOUR(4);

  Ranks(int rank) {
    this.rank = rank;
  }

  private Integer rank;

  public Integer getRank() {
    return this.rank;
  }

}
