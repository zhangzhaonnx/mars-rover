package com.itutry.v3;

import static com.itutry.v3.Direction.NORTH;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ControlCenterTest {

  @Test
  void executeCommand_should_success() {
    ControlCenter center = new ControlCenter();
    center.intiRover(RoverState.of(0, 0, NORTH));
    RoverState result = center.executeCommand("M,M,L,M,R,M");
    Assert.assertThat(result.getX(), is(-1));
    Assert.assertThat(result.getY(), is(3));
    Assert.assertThat(result.getFacing(), is(NORTH));
  }
}
