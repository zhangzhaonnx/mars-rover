package com.itutry.v2;

public class RightCommand implements Command {

  @Override
  public RoverState execute(RoverState state) {
    Direction facing = state.getFacing().rightDirection();
    return new RoverState(state.getX(), state.getY(), facing);
  }
}
