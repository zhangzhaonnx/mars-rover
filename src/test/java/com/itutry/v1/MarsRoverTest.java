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

  @Test
  public void move_should_increase_x_for_direction_E() {
    MarsRover rover = new MarsRover();
    rover.init(0, 0, "E");
    rover.move();

    Assert.assertThat(rover.getX(), is(1));
    Assert.assertThat(rover.getY(), is(0));
    Assert.assertThat(rover.getDirection(), is("E"));
  }

  @Test
  public void move_should_decrease_y_for_direction_S() {
    MarsRover rover = new MarsRover();
    rover.init(0, 0, "S");
    rover.move();

    Assert.assertThat(rover.getX(), is(0));
    Assert.assertThat(rover.getY(), is(-1));
    Assert.assertThat(rover.getDirection(), is("S"));
  }

  @Test
  public void move_should_decrease_x_for_direction_W() {
    MarsRover rover = new MarsRover();
    rover.init(0, 0, "W");
    rover.move();

    Assert.assertThat(rover.getX(), is(-1));
    Assert.assertThat(rover.getY(), is(0));
    Assert.assertThat(rover.getDirection(), is("W"));
  }

  @Test
  public void turnLeft_should_W_for_direction_N() {
    MarsRover rover = new MarsRover();
    rover.init(0, 0, "N");
    rover.turnLeft();

    Assert.assertThat(rover.getX(), is(0));
    Assert.assertThat(rover.getY(), is(0));
    Assert.assertThat(rover.getDirection(), is("W"));
  }

  @Test
  public void turnLeft_should_S_for_direction_W() {
    MarsRover rover = new MarsRover();
    rover.init(0, 0, "W");
    rover.turnLeft();

    Assert.assertThat(rover.getX(), is(0));
    Assert.assertThat(rover.getY(), is(0));
    Assert.assertThat(rover.getDirection(), is("S"));
  }

  @Test
  public void turnLeft_should_E_for_direction_S() {
    MarsRover rover = new MarsRover();
    rover.init(0, 0, "S");
    rover.turnLeft();

    Assert.assertThat(rover.getX(), is(0));
    Assert.assertThat(rover.getY(), is(0));
    Assert.assertThat(rover.getDirection(), is("E"));
  }

  @Test
  public void turnLeft_should_N_for_direction_E() {
    MarsRover rover = new MarsRover();
    rover.init(0, 0, "E");
    rover.turnLeft();

    Assert.assertThat(rover.getX(), is(0));
    Assert.assertThat(rover.getY(), is(0));
    Assert.assertThat(rover.getDirection(), is("N"));
  }
}
