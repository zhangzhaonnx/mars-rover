package com.itutry.v1;

public enum Direction {
  N {
    @Override
    public Direction turnLeft() {
      return W;
    }

    @Override
    public Direction turnRight() {
      return E;
    }

    @Override
    public void move(Point p) {
      p.moveN();
    }
  },
  E {
    @Override
    public Direction turnLeft() {
      return N;
    }

    @Override
    public Direction turnRight() {
      return S;
    }

    @Override
    public void move(Point p) {
      p.moveE();
    }
  },
  S {
    @Override
    public Direction turnLeft() {
      return E;
    }

    @Override
    public Direction turnRight() {
      return W;
    }

    @Override
    public void move(Point p) {
      p.moveS();
    }
  },
  W {
    @Override
    public Direction turnLeft() {
      return S;
    }

    @Override
    public Direction turnRight() {
      return N;
    }

    @Override
    public void move(Point p) {
      p.moveW();
    }
  };

  public abstract Direction turnLeft();

  public abstract Direction turnRight();

  public abstract void move(Point p);
}
