package com.itutry.v2;

import static com.itutry.v2.Direction.E;
import static com.itutry.v2.Direction.N;
import static com.itutry.v2.Direction.S;
import static com.itutry.v2.Direction.W;

public class MoveCommand implements Command {

  @Override
  public RoverState execute(RoverState state) {
    if (state.getFacing() == N) {
      return new RoverState(state.getX(), state.getY() + 1, state.getFacing());
    }
    if (state.getFacing() == E) {
      return new RoverState(state.getX() + 1, state.getY(), state.getFacing());
    }
    if (state.getFacing() == S) {
      return new RoverState(state.getX(), state.getY() - 1, state.getFacing());
    }
    if (state.getFacing() == W) {
      return new RoverState(state.getX() - 1, state.getY(), state.getFacing());
    }
    return null;
  }
}
