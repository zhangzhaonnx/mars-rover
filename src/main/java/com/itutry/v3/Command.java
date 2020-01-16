package com.itutry.v3;

public interface Command {

  RoverState action(RoverState state);

  Command EMPTY = state -> state;
}
