package com.priyakdey.design.patterns.structural.bridge.example2;

import com.priyakdey.design.patterns.structural.bridge.example2.button.*;
import com.priyakdey.design.patterns.structural.bridge.example2.size.LargeSize;
import com.priyakdey.design.patterns.structural.bridge.example2.size.MediumSize;
import com.priyakdey.design.patterns.structural.bridge.example2.size.SmallSize;

public class Canvas {

  public static void main(String[] args) {

    CheckboxButton checkboxButton = new CheckboxButton(new SmallSize());
    checkboxButton.draw();

    RadioButton radioButton = new RadioButton(new MediumSize());
    radioButton.draw();

    DropdownButton dropdownButton = new DropdownButton(new LargeSize());
    dropdownButton.draw();

  }

}
