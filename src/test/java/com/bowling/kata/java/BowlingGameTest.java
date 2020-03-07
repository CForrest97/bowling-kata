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
  
  private void rollSpare() {
    rollMany(2, 5);
  }
  
  private void rollStrike() {
    g.roll(10);
  }
  
  @Test
  public void testGutterGame() {
    rollMany(20, 0);
    assertEquals(0, g.getScore());
  }
  
  @Test
  public void testAllOnes() {
    rollMany(20, 1);
    assertEquals(20, g.getScore());
  }
  
  @Test
  public void testOneSpare() {
    rollSpare();
    g.roll(3);
    assertEquals(16, g.getScore());
  }
  
  @Test
  public void testOneStrike() {
    rollStrike();
    rollMany(2, 3);
    assertEquals(22, g.getScore());
  }
}
