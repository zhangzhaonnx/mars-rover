package com.itutry.v3;

import java.util.List;

public class ControlCenter {

  private final CommandParser commandParser;
  private MarsRover rover;

  public ControlCenter() {
    this.commandParser = new CommandParser();
  }

  public void intiRover(RoverState state) {
    this.rover = new MarsRover(state);
  }

  public RoverState executeCommand(String instruction) {
    List<Command> commands = commandParser.parse(instruction);
    commands.forEach(cmd -> rover.execute(cmd));
    return rover.getState();
  }
}
