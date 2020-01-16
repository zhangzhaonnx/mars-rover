package com.itutry.v3;

public class MarsRover {

  private RoverState state;

  public MarsRover(RoverState state) {
    this.state = state;
  }

  public void execute(Command cmd) {
    state = cmd.action(state);
  }

  public RoverState getState() {
    return state;
  }
}
