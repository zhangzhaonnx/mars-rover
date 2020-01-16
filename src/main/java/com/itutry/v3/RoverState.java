package com.itutry.v3;

public class RoverState {

  private final int x;
  private final int y;
  private final Direction facing;

  private RoverState(int x, int y, Direction facing) {
    this.x = x;
    this.y = y;
    this.facing = facing;
  }

  public static RoverState of(int x, int y, Direction facing) {
    return new RoverState(x, y, facing);
  }

  public RoverState adjustX(int delta) {
    return RoverState.of(x + delta, y, facing);
  }

  public RoverState adjustY(int delta) {
    return RoverState.of(x, y + delta, facing);
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public Direction getFacing() {
    return facing;
  }
}
