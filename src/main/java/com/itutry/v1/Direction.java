package com.itutry.v1;

public enum Direction {
  N {
    @Override
    Direction turnLeft() {
      return W;
    }
  },
  E {
    @Override
    Direction turnLeft() {
      return N;
    }
  },
  W {
    @Override
    Direction turnLeft() {
      return S;
    }
  },
  S {
    @Override
    Direction turnLeft() {
      return E;
    }
  };

  abstract Direction turnLeft();
}
