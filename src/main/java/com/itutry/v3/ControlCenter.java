package com.itutry.v3;

import java.util.List;

public class ControlCenter {

  private final CommandParser commandParser;
  private MarsRover rover;

  public ControlCenter() {
    this.commandParser = new CommandParser();
  }

  public void initRover(RoverState state) {
    this.rover = new MarsRover(state);
  }

  public RoverState executeCommand(String commandStr) {
    List<Command> commands = commandParser.parse(commandStr);
    commands.forEach(cmd -> rover.execute(cmd));
    return rover.getState();
  }
}
