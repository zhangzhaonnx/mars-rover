package com.itutry.v2;

import java.util.List;

public class MarsRover {

  private RoverState state;

  public RoverState execute(List<Command> commands) {
    commands.forEach(command -> {
      this.state = command.execute(this.state);
    });
    return this.state;
  }
}
