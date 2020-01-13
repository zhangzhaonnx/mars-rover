package com.itutry.v2;

public interface Command {

  RoverState execute(RoverState state);
}
