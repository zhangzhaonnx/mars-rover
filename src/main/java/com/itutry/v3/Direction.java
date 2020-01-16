package com.itutry.v3;

public enum Direction {
  EAST, SOUTH, WEST, NORTH;

  public Direction leftOne() {
    return Direction.values()[(ordinal() + 3) % 4];
  }
}
