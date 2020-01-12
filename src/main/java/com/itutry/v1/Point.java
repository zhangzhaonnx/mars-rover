package com.itutry.v1;

public class Point {
  private int x;
  private int y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public void moveN() {
    this.y += 1;
  }

  public void moveE() {
    this.x += 1;
  }

  public void moveW() {
    this.x -= 1;
  }

  public void moveS() {
    this.y -= 1;
  }

  public int getX() {
    return this.x;
  }

  public int getY() {
    return this.y;
  }
}
