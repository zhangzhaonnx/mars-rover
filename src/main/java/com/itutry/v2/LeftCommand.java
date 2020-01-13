package com.itutry.v2;

public class LeftCommand implements Command {

  @Override
  public RoverState execute(RoverState state) {
    Direction facing = state.getFacing().leftDirection();
    return new RoverState(state.getX(), state.getY(), facing);
  }
}
