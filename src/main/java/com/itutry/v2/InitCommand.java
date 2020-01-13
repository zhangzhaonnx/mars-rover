package com.itutry.v2;

public class InitCommand implements Command {

  private RoverState state;

  public InitCommand(RoverState state) {
    this.state = state;
  }

  @Override
  public RoverState execute(RoverState state) {
    return this.state;
  }
}
