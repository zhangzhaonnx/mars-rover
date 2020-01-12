package com.itutry.v1;

public enum Direction {
  N {
    @Override
    Direction turnLeft() {
      return W;
    }

    @Override
    Direction turnRight() {
      return E;
    }
  },
  E {
    @Override
    Direction turnLeft() {
      return N;
    }

    @Override
    Direction turnRight() {
      return S;
    }
  },
  W {
    @Override
    Direction turnLeft() {
      return S;
    }

    @Override
    Direction turnRight() {
      return N;
    }
  },
  S {
    @Override
    Direction turnLeft() {
      return E;
    }

    @Override
    Direction turnRight() {
      return W;
    }
  };

  abstract Direction turnLeft();

  abstract Direction turnRight();
}
