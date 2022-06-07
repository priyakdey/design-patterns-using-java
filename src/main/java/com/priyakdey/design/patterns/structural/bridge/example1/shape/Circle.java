package com.priyakdey.design.patterns.structural.bridge.example1.shape;

import com.priyakdey.design.patterns.structural.bridge.example1.color.ShapeColor;

import java.awt.*;

/**
 * @author Priyak Dey
 * @since 08-06-2022
 */
public class Circle extends Shape {

    public Circle(ShapeColor shapeColor) {
        super(shapeColor);
    }

    @Override
    public void draw(Graphics graphics) {
        super.setColor(graphics);
        graphics.fillOval(115, 15, 100, 100);
    }
}
