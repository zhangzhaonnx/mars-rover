package com.itutry.v3;

public class TurnRight implements Command {

  @Override
  public RoverState action(RoverState state) {
    if (state.getBacking()) {
      return RoverState.of(state.getX(), state.getY(),
          state.getFacing().oppositeOne().rightOne(), state.getBacking());
    }
    return RoverState.of(state.getX(), state.getY(), state.getFacing().rightOne());
  }
}
