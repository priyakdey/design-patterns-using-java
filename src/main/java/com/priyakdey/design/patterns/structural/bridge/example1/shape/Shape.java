package com.priyakdey.design.patterns.structural.bridge.example1.shape;

import com.priyakdey.design.patterns.structural.bridge.example1.color.ShapeColor;

import java.awt.*;

/**
 * @author Priyak Dey
 * @since 08-06-2022
 */
public abstract class Shape {

    protected final ShapeColor shapeColor;

    protected Shape(ShapeColor shapeColor) {
        this.shapeColor = shapeColor;
    }

    public abstract void draw(Graphics graphics);

    protected final void setColor(Graphics graphics) {
        graphics.setColor(shapeColor.getColor());
    }

}
