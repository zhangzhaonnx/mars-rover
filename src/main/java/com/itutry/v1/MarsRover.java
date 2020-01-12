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
    Direction d = Direction.valueOf(direction);
    direction = d.turnLeft().name();
  }

  public void turnRight() {
    Direction d = Direction.valueOf(direction);
    if (d == Direction.N) {
      direction = Direction.E.name();
    } else if (d == Direction.E) {
      direction = Direction.S.name();
    } else if (d == Direction.S) {
      direction = Direction.W.name();
    } else if (d == Direction.W) {
      direction = Direction.N.name();
    }
  }
}
