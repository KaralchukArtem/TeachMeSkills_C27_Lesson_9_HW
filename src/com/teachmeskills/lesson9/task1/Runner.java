package com.teachmeskills.lesson9.task1;

import com.teachmeskills.lesson9.task1.entity.Circle;
import com.teachmeskills.lesson9.task1.entity.Figure;
import com.teachmeskills.lesson9.task1.entity.Square;
import com.teachmeskills.lesson9.task1.entity.Rectangle;
import com.teachmeskills.lesson9.task1.entity.Rhombus;
import com.teachmeskills.lesson9.task1.entity.Triangle;

/**
 *
 */

public class Runner {

    public static void main(String[] args) {

        double sum = 0;

        Triangle triangle = new Triangle(5.13, 5.86);
        Rectangle rectangle = new Rectangle(6.12, 8.4);
        Circle circle = new Circle(10);
        Square square = new Square(12.52);
        Rhombus rhombus = new Rhombus(4, 7.5);

        Figure[] figures = {triangle, rectangle, circle, square, rhombus};

        System.out.println("Area :");
        for (Figure figure : figures) {
            System.out.println(figure.getName() + " " + figure.calculationOfArea());
        }
        System.out.println("\nPyrimeter :");
        for (Figure figure : figures) {
            System.out.println(figure.getName() + " " + figure.calculationOfPyrimeter());
        }

        System.out.print("\n");
        for (Figure figure : figures) {
            sum += figure.calculationOfPyrimeter();
        }
        System.out.println("Sum - " + sum);


    }

}
