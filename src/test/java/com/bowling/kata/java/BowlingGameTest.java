package com.bowling.kata.java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BowlingGameTest {
  @Test
  public void testGutterGame() {
    BowlingGame g = new BowlingGame();
    for (int i = 0; i < 20; i++) {
      g.roll(0);
    }
    assertEquals(g.getScore(), 0);
  }
}
