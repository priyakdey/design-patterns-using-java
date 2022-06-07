package com.priyakdey.design.patterns.structural.bridge.example1;

import com.priyakdey.design.patterns.structural.bridge.example1.color.*;
import com.priyakdey.design.patterns.structural.bridge.example1.shape.Circle;
import com.priyakdey.design.patterns.structural.bridge.example1.shape.Square;
import com.priyakdey.design.patterns.structural.bridge.example1.shape.Triangle;

import javax.swing.*;
import java.awt.*;
import java.io.Serial;

/**
 * @author Priyak Dey
 * @since 08-06-2022
 */
public class Canvas extends JPanel {

    @Serial
    private static final long serialVersionUID = -5591937659478198888L;

    public static void main(String[] args) {
        // Create a canvas to draw on
        JFrame jFrame = new JFrame();
        jFrame.setSize(480, 320);
        jFrame.add(new Canvas());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }


    public void paint(Graphics graphics) {
        ShapeColor blue = new ShapeColorBlue();
        Square square = new Square(blue);
        square.draw(graphics);


        ShapeColor red = new ShapeColorRed();
        Circle circle = new Circle(red);
        circle.draw(graphics);

        ShapeColor green = new ShapeColorGreen();
        Triangle triangle = new Triangle(green);
        triangle.draw(graphics);

        // lets try and draw a black triangle now
        ShapeColor black = new ShapeColorBlack();
        Triangle blackTriangle = new Triangle(black);
        blackTriangle.draw(graphics); // anyways it overlaps previous shapes cause positions are hard coded
    }

}
