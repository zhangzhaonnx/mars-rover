package com.itutry.v3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommandParser {

  public List<Command> parse(String instruction) {
    return Arrays.stream(instruction.split(","))
        .map(ins -> parseSingle(ins))
        .collect(Collectors.toList());
  }

  public Command parseSingle(String instruction) {
    switch (instruction) {
      case "M":
        return new Move();
      case "L":
        return new TurnLeft();
      case "R":
        return new TurnRight();
    }
    return null;
  }
}
