package com.bowling.kata.java;

public class BowlingGame {
  private int score = 0;
  public void roll(int pins) {
    score += pins;
  }
  public int getScore() {
    return score;
  }
}