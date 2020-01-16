package com.itutry.v3;

import static lombok.AccessLevel.PRIVATE;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = PRIVATE)
public class RoverState {

  private final int x;
  private final int y;
  private final Direction facing;
  private final Boolean backing;

  public static RoverState of(int x, int y, Direction facing) {
    return new RoverState(x, y, facing, false);
  }

  public static RoverState of(int x, int y, Direction facing, Boolean backing) {
    return new RoverState(x, y, facing, backing);
  }

  public RoverState adjustX(int delta) {
    return RoverState.of(x + delta, y, facing, backing);
  }

  public RoverState adjustY(int delta) {
    return RoverState.of(x, y + delta, facing, backing);
  }

  public Boolean getBacking() {
    return backing;
  }
}
