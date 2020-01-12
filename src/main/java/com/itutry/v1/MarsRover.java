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
    Direction d = Direction.valueOf(direction);
    if (d == Direction.N) {
      y += 1;
    }
    if (d == Direction.E) {
      x += 1;
    }
    if (d == Direction.S) {
      y -= 1;
    }
    if (d == Direction.W) {
      x -= 1;
    }
  }

  public void turnLeft() {
    if (direction.equals("N")) {
      direction = "W";
    } else if (direction.equals("W")) {
      direction = "S";
    } else if (direction.equals("S")) {
      direction = "E";
    } else if (direction.equals("E")) {
      direction = "N";
    }
  }

  public void turnRight() {
    if (direction.equals("N")) {
      direction = "E";
    } else if (direction.equals("E")) {
      direction = "S";
    } else if (direction.equals("S")) {
      direction = "W";
    } else if (direction.equals("W")) {
      direction = "N";
    }
  }
}
