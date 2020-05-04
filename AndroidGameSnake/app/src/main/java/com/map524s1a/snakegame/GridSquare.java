package com.map524s1a.snakegame;

import android.graphics.Color;


public class GridSquare {
  private int mType;

  public GridSquare(int type) {
    mType = type;
  }

  public int getColor() {
    switch (mType) {
      case GameType.GRID:
        return Color.WHITE;
      case GameType.FOOD:
        return Color.RED;
      case GameType.SNAKE:
        return Color.BLACK;
    }
    return Color.WHITE;
  }

  public void setType(int type) {
    mType = type;
  }
}
