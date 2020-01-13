package com.itutry.v2;

public class LeftCommand implements Command {

  @Override
  public RoverState execute(RoverState state) {
    Direction facing = state.getFacing();
    facing = Direction.valueOf((facing.getCode() + 3) % 4);
    return new RoverState(state.getX(), state.getY(), facing);
  }
}
