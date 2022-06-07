package com.priyakdey.design.patterns.structural.bridge.example2.button;

import com.priyakdey.design.patterns.structural.bridge.example2.size.Size;

public class RadioButton extends Button {

    public RadioButton(Size size) {
        super(size);
    }

    public void draw() {
        size.setSize();
        System.out.println("Drawing a radio button.\n");
    }

}
