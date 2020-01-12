package com.itutry.v1;

public class MarsRover {

  private Point position;
  private Direction direction;

  public void init(Point position, Direction direction) {
    this.position = position;
    this.direction = direction;
  }

  public Point getPosition() {
    return this.position;
  }

  public Direction getDirection() {
    return direction;
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
