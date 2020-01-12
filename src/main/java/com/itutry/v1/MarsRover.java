package com.itutry.v1;

public class MarsRover {

  private int x;
  private int y;
  private String direction;

  public void init(int x, int y, String direction) {
    this.x = x;
    this.y = y;
    this.direction = direction;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public String getDirection() {
    return direction;
  }

  public void move() {
    if (direction.equals("N")) {
      y += 1;
    }
    if (direction.equals("E")) {
      x += 1;
    }
    if (direction.equals("S")) {
      y -= 1;
    }
    if (direction.equals("W")) {
      x -= 1;
    }
  }
}
