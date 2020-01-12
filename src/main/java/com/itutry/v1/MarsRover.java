package com.itutry.v1;

public class MarsRover {

  private Point position;
  private Direction direction;

  public void init(int x, int y, String direction) {
    this.position = new Point(x, y);
    this.direction = Direction.valueOf(direction);
  }

  public int getX() {
    return position.getX();
  }

  public int getY() {
    return position.getY();
  }

  public String getDirection() {
    return direction.name();
  }

  public void move() {
    direction.move(position);
  }

  public void turnLeft() {
    direction = direction.turnLeft();
  }

  public void turnRight() {
    direction = direction.turnRight();
  }
}
