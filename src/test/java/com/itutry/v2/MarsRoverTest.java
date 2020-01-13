package com.itutry.v2;

import static com.itutry.v2.Direction.E;
import static com.itutry.v2.Direction.N;
import static com.itutry.v2.Direction.S;
import static com.itutry.v2.Direction.W;
import static org.hamcrest.CoreMatchers.is;

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

  @Test
  public void should_move_success_when_facing_N() {
    MarsRover rover = new MarsRover();
    List<Command> commands = Arrays.asList(
        new InitCommand(new RoverState(0, 0, N)),
        new MoveCommand());
    RoverState state = rover.execute(commands);

    Assert.assertThat(state.getX(), is(0));
    Assert.assertThat(state.getY(), is(1));
    Assert.assertThat(state.getFacing(), is(N));
  }

  @Test
  public void should_move_success_when_facing_E() {
    MarsRover rover = new MarsRover();
    List<Command> commands = Arrays.asList(
        new InitCommand(new RoverState(0, 0, E)),
        new MoveCommand());
    RoverState state = rover.execute(commands);

    Assert.assertThat(state.getX(), is(1));
    Assert.assertThat(state.getY(), is(0));
    Assert.assertThat(state.getFacing(), is(E));
  }

  @Test
  public void should_move_success_when_facing_S() {
    MarsRover rover = new MarsRover();
    List<Command> commands = Arrays.asList(
        new InitCommand(new RoverState(0, 0, S)),
        new MoveCommand());
    RoverState state = rover.execute(commands);

    Assert.assertThat(state.getX(), is(0));
    Assert.assertThat(state.getY(), is(-1));
    Assert.assertThat(state.getFacing(), is(S));
  }

  @Test
  public void should_move_success_when_facing_W() {
    MarsRover rover = new MarsRover();
    List<Command> commands = Arrays.asList(
        new InitCommand(new RoverState(0, 0, W)),
        new MoveCommand());
    RoverState state = rover.execute(commands);

    Assert.assertThat(state.getX(), is(-1));
    Assert.assertThat(state.getY(), is(0));
    Assert.assertThat(state.getFacing(), is(W));
  }

  @Test
  public void should_turnLeft_success_when_facing_N() {
    MarsRover rover = new MarsRover();
    List<Command> commands = Arrays.asList(
        new InitCommand(new RoverState(0, 0, N)),
        new LeftCommand());
    RoverState state = rover.execute(commands);

    Assert.assertThat(state.getX(), is(0));
    Assert.assertThat(state.getY(), is(0));
    Assert.assertThat(state.getFacing(), is(W));
  }

  @Test
  public void should_turnLeft_success_when_facing_E() {
    MarsRover rover = new MarsRover();
    List<Command> commands = Arrays.asList(
        new InitCommand(new RoverState(0, 0, E)),
        new LeftCommand());
    RoverState state = rover.execute(commands);

    Assert.assertThat(state.getX(), is(0));
    Assert.assertThat(state.getY(), is(0));
    Assert.assertThat(state.getFacing(), is(N));
  }

  @Test
  public void should_turnLeft_success_when_facing_S() {
    MarsRover rover = new MarsRover();
    List<Command> commands = Arrays.asList(
        new InitCommand(new RoverState(0, 0, S)),
        new LeftCommand());
    RoverState state = rover.execute(commands);

    Assert.assertThat(state.getX(), is(0));
    Assert.assertThat(state.getY(), is(0));
    Assert.assertThat(state.getFacing(), is(E));
  }

  @Test
  public void should_turnLeft_success_when_facing_W() {
    MarsRover rover = new MarsRover();
    List<Command> commands = Arrays.asList(
        new InitCommand(new RoverState(0, 0, W)),
        new LeftCommand());
    RoverState state = rover.execute(commands);

    Assert.assertThat(state.getX(), is(0));
    Assert.assertThat(state.getY(), is(0));
    Assert.assertThat(state.getFacing(), is(S));
  }

  @Test
  public void should_turnRight_success_when_facing_N() {
    MarsRover rover = new MarsRover();
    List<Command> commands = Arrays.asList(
        new InitCommand(new RoverState(0, 0, N)),
        new RightCommand());
    RoverState state = rover.execute(commands);

    Assert.assertThat(state.getX(), is(0));
    Assert.assertThat(state.getY(), is(0));
    Assert.assertThat(state.getFacing(), is(E));
  }

  @Test
  public void should_turnRight_success_when_facing_E() {
    MarsRover rover = new MarsRover();
    List<Command> commands = Arrays.asList(
        new InitCommand(new RoverState(0, 0, E)),
        new RightCommand());
    RoverState state = rover.execute(commands);

    Assert.assertThat(state.getX(), is(0));
    Assert.assertThat(state.getY(), is(0));
    Assert.assertThat(state.getFacing(), is(S));
  }

  @Test
  public void should_turnRight_success_when_facing_S() {
    MarsRover rover = new MarsRover();
    List<Command> commands = Arrays.asList(
        new InitCommand(new RoverState(0, 0, S)),
        new RightCommand());
    RoverState state = rover.execute(commands);

    Assert.assertThat(state.getX(), is(0));
    Assert.assertThat(state.getY(), is(0));
    Assert.assertThat(state.getFacing(), is(W));
  }

  @Test
  public void should_turnRight_success_when_facing_W() {
    MarsRover rover = new MarsRover();
    List<Command> commands = Arrays.asList(
        new InitCommand(new RoverState(0, 0, W)),
        new RightCommand());
    RoverState state = rover.execute(commands);

    Assert.assertThat(state.getX(), is(0));
    Assert.assertThat(state.getY(), is(0));
    Assert.assertThat(state.getFacing(), is(N));
  }
}
