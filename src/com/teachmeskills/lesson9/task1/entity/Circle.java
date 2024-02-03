package com.teachmeskills.lesson9.task1.entity;

public final class Circle extends Figure {

    public String name = "Circle";

    double result;

    public Circle(double length) {
        super(length);
    }

    @Override
    public double calculationOfArea() {
        result = (length * 2) / (4 * Math.PI);
        return result;
    }

    @Override
    public double calculationOfPyrimeter() {
        result = length;
        return result;
    }

    @Override
    public String getName() {
        return name;
    }
}
