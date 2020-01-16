package com.itutry.v3;

public class TurnLeft implements Command {

  @Override
  public RoverState action(RoverState state) {
    if (state.getBacking()) {
      return RoverState.of(state.getX(), state.getY(), state.getFacing().oppositeOne().leftOne());
    }
    return RoverState.of(state.getX(), state.getY(), state.getFacing().leftOne());
  }
}
