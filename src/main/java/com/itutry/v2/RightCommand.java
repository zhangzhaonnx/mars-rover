package com.itutry.v2;

public class RightCommand implements Command {

  @Override
  public RoverState execute(RoverState state) {
    Direction facing = state.getFacing();
    facing = Direction.valueOf((facing.getCode() + 1) % 4);
    return new RoverState(state.getX(), state.getY(), facing);
  }
}
