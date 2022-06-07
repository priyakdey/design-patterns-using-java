package com.priyakdey.design.patterns.structural.bridge.example2.button;

import com.priyakdey.design.patterns.structural.bridge.example2.size.Size;

public abstract class Button {

  protected final Size size;

  protected Button(Size size) {
    this.size = size;
  }

  abstract void draw();

  protected void setSize() {
    size.setSize();
  }

}
