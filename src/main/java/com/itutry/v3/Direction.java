package com.itutry.v3;

public enum Direction {
  EAST, SOUTH, WEST, NORTH;

  public Direction leftOne() {
    return Direction.values()[(ordinal() + 3) % 4];
  }

  public Direction rightOne() {
    return Direction.values()[(ordinal() + 1) % 4];
  }

  public Direction oppositeOne() {
    return Direction.values()[(ordinal() + 2) % 4];
  }
}
