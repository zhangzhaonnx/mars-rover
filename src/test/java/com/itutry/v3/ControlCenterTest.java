package com.itutry.v3;

import static com.itutry.v3.Direction.NORTH;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ControlCenterTest {

  @Test
  void executeCommand_should_success() {
    ControlCenter center = new ControlCenter();
    center.initRover(RoverState.of(0, 0, NORTH));
    RoverState result = center.executeCommand("M,M,L,M,R,M,B,M,M,L,M,R,M");
    Assert.assertThat(result.getX(), is(-2));
    Assert.assertThat(result.getY(), is(0));
    Assert.assertThat(result.getFacing(), is(NORTH));
    Assert.assertThat(result.getBacking(), is(true));
  }

  @Test
  void executeCommand_should_success_for_empty_commend() {
    ControlCenter center = new ControlCenter();
    center.initRover(RoverState.of(0, 0, NORTH));
    RoverState result = center.executeCommand("");
    Assert.assertThat(result.getX(), is(0));
    Assert.assertThat(result.getY(), is(0));
    Assert.assertThat(result.getFacing(), is(NORTH));
  }

  @Test
  void executeCommand_should_success_for_invalid_commend() {
    ControlCenter center = new ControlCenter();
    center.initRover(RoverState.of(0, 0, NORTH));
    RoverState result = center.executeCommand("T");
    Assert.assertThat(result.getX(), is(0));
    Assert.assertThat(result.getY(), is(0));
    Assert.assertThat(result.getFacing(), is(NORTH));
  }
}
