package com.itutry.v1;

import static org.hamcrest.CoreMatchers.is;

import org.junit.Assert;
import org.junit.Test;

public class MarsRoverTest {

  @Test
  public void init_should_report_same_position_and_direction() {
    MarsRover rover = new MarsRover();
    rover.init(1, 1, "N");

    Assert.assertThat(rover.getX(), is(1));
    Assert.assertThat(rover.getY(), is(1));
    Assert.assertThat(rover.getDirection(), is("N"));
  }

  @Test
  public void move_should_increase_y_for_direction_N() {
    MarsRover rover = new MarsRover();
    rover.init(0, 0, "N");
    rover.move();

    Assert.assertThat(rover.getX(), is(0));
    Assert.assertThat(rover.getY(), is(1));
    Assert.assertThat(rover.getDirection(), is("N"));
  }
}
