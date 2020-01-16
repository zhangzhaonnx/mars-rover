package com.itutry.v3;

import static com.itutry.v3.Direction.EAST;
import static com.itutry.v3.Direction.NORTH;
import static com.itutry.v3.Direction.SOUTH;
import static com.itutry.v3.Direction.WEST;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Function;

public class Move implements Command {

  private static final Map<Direction, Function<RoverState, RoverState>> MAPPING =
      new EnumMap<>(Direction.class);

  static {
    MAPPING.put(EAST, state -> state.adjustX(1));
    MAPPING.put(SOUTH, state -> state.adjustY(-1));
    MAPPING.put(WEST, state -> state.adjustX(-1));
    MAPPING.put(NORTH, state -> state.adjustY(1));
  }

  @Override
  public RoverState action(RoverState state) {
    return MAPPING.get(state.getFacing()).apply(state);
  }
}
