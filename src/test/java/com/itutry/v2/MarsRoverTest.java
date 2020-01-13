package com.itutry.v2;

import static com.itutry.v2.Direction.N;
import static org.hamcrest.CoreMatchers.is;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class MarsRoverTest {

  @Test
  public void should_init_state_success() {
    MarsRover rover = new MarsRover();
    List<Command> commands = Arrays.asList(new InitCommand(new RoverState(1, 1, N)));
    RoverState state = rover.execute(commands);

    Assert.assertThat(state.getX(), is(1));
    Assert.assertThat(state.getY(), is(1));
    Assert.assertThat(state.getFacing(), is(N));
  }
}
