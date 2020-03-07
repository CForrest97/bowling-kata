package com.bowling.kata.java;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BowlingGameTest {
  private BowlingGame g;

  @Before
  public void setUp() {
    g = new BowlingGame();
  }

  private void rollMany(int n, int pins) {
    for (int i = 0; i < n; i++) {
      g.roll(pins);
    }
  }
  
  @Test
  public void testGutterGame() {
    rollMany(20, 0);
    assertEquals(g.getScore(), 0);
  }
  
  @Test
  public void testAllOnes() {
    rollMany(20, 1);
    assertEquals(g.getScore(), 20);
  }
}
