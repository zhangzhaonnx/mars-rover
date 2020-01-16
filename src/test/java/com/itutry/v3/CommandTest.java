package com.itutry.v3;

import static com.itutry.v3.Direction.EAST;
import static com.itutry.v3.Direction.NORTH;
import static com.itutry.v3.Direction.SOUTH;
import static com.itutry.v3.Direction.WEST;
import static org.hamcrest.CoreMatchers.is;

import java.util.stream.Stream;
import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class CommandTest {

  @ParameterizedTest
  @MethodSource("moveArguments")
  public void move_should_success(RoverState input, RoverState output) {
    Command command = new Move();

    RoverState state = command.action(input);

    Assert.assertThat(state.getX(), is(output.getX()));
    Assert.assertThat(state.getY(), is(output.getY()));
    Assert.assertThat(state.getFacing(), is(output.getFacing()));
  }

  @ParameterizedTest
  @MethodSource("turnLeftArguments")
  public void turnLeft_should_success(RoverState input, RoverState output) {
    Command command = new TurnLeft();

    RoverState state = command.action(input);

    Assert.assertThat(state.getX(), is(output.getX()));
    Assert.assertThat(state.getY(), is(output.getY()));
    Assert.assertThat(state.getFacing(), is(output.getFacing()));
  }

  static Stream<Arguments> moveArguments() {
    return Stream.of(
        Arguments.of(RoverState.of(0, 0, EAST), RoverState.of(1, 0, EAST)),
        Arguments.of(RoverState.of(0, 0, SOUTH), RoverState.of(0, -1, SOUTH)),
        Arguments.of(RoverState.of(0, 0, WEST), RoverState.of(-1, 0, WEST)),
        Arguments.of(RoverState.of(0, 0, NORTH), RoverState.of(0, 1, NORTH))
    );
  }

  static Stream<Arguments> turnLeftArguments() {
    return Stream.of(
        Arguments.of(RoverState.of(0, 0, EAST), RoverState.of(0, 0, NORTH)),
        Arguments.of(RoverState.of(0, 0, SOUTH), RoverState.of(0, 0, EAST)),
        Arguments.of(RoverState.of(0, 0, WEST), RoverState.of(0, 0, SOUTH)),
        Arguments.of(RoverState.of(0, 0, NORTH), RoverState.of(0, 0, WEST))
    );
  }
}
