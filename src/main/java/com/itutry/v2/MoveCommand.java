package com.itutry.v2;

public class MoveCommand implements Command {

  @Override
  public RoverState execute(RoverState state) {
    int x = state.getX();
    int y = state.getY();
    switch (state.getFacing()) {
      case N:
        y += 1;
        break;
      case E:
        x += 1;
        break;
      case S:
        y -= 1;
        break;
      case W:
        x -= 1;
        break;
    }
    return new RoverState(x, y, state.getFacing());
  }
}
