package com.itutry.v3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class CommandParser {

  public static final String COMMAND_SEPARATOR = ",";
  private static final Map<String, Supplier<Command>> COMMAND_MAPPING = new HashMap<>();

  static {
    COMMAND_MAPPING.put("M", Move::new);
    COMMAND_MAPPING.put("L", TurnLeft::new);
    COMMAND_MAPPING.put("R", TurnRight::new);
  }

  public List<Command> parse(String commandStr) {
    return Arrays.stream(commandStr.split(COMMAND_SEPARATOR))
        .map(this::parseSingle)
        .collect(Collectors.toList());
  }

  public Command parseSingle(String commandStr) {
    return COMMAND_MAPPING.getOrDefault(commandStr, () -> Command.EMPTY).get();
  }
}
