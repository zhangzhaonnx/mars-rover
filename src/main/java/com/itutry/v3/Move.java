package com.itutry.v3;

import static com.itutry.v3.Direction.EAST;
import static com.itutry.v3.Direction.NORTH;
import static com.itutry.v3.Direction.SOUTH;
import static com.itutry.v3.Direction.WEST;

public class Move implements Command {

  @Override
  public RoverState action(RoverState state) {
    int x = state.getX();
    int y = state.getY();
    if (state.getFacing() == EAST) {
      x += 1;
    }
    if (state.getFacing() == SOUTH) {
      y -= 1;
    }
    if (state.getFacing() == WEST) {
      x -= 1;
    }
    if (state.getFacing() == NORTH) {
      y += 1;
    }

    return RoverState.of(x, y, state.getFacing());
  }
}
