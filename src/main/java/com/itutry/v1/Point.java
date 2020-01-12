package com.itutry.v1;

import java.util.Objects;

public class Point {
  private int x;
  private int y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public void moveN() {
    this.y += 1;
  }

  public void moveE() {
    this.x += 1;
  }

  public void moveW() {
    this.x -= 1;
  }

  public void moveS() {
    this.y -= 1;
  }

  public int getX() {
    return this.x;
  }

  public int getY() {
    return this.y;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Point point = (Point) o;
    return x == point.x &&
        y == point.y;
  }

  @Override
  public int hashCode() {
    return Objects.hash(x, y);
  }
}
