package com.priyakdey.design.patterns.structural.bridge.example1.shape;

import com.priyakdey.design.patterns.structural.bridge.example1.color.ShapeColor;

import java.awt.*;

/**
 * @author Priyak Dey
 * @since 08-06-2022
 */
public class Triangle extends Shape {

    public Triangle(ShapeColor shapeColor) {
        super(shapeColor);
    }

    @Override
    public void draw(Graphics graphics) {
        super.setColor(graphics);
        int[] x = {270, 310, 230};
        int[] y = {15, 115, 115};
        int n = 3;
        graphics.fillPolygon(x, y, 3);
    }
}
