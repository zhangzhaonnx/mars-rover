package com.itutry.v2;

public class RoverState {

  private int x;
  private int y;
  private Direction facing;

  public RoverState(int x, int y, Direction facing) {
    this.x = x;
    this.y = y;
    this.facing = facing;
  }

  public int getX() {
    return this.x;
  }

  public int getY() {
    return this.y;
  }

  public Direction getFacing() {
    return this.facing;
  }
}
