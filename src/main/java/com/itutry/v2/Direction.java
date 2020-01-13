package com.itutry.v2;

import java.util.Arrays;

public enum Direction {
  N(0), E(1), S(2), W(3);

  private int code;

  Direction(int code) {
    this.code = code;
  }

  public static Direction valueOf(int code) {
    return Arrays.stream(Direction.values())
        .filter(d -> d.getCode() == code)
        .findFirst().orElse(null);
  }

  public int getCode() {
    return this.code;
  }
}
