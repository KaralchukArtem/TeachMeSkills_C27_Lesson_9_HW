package com.teachmeskills.lesson9.task1.entity;

public final class Triangle extends Figure {

    public String name = "Triangle";
    double width;
    double result;

    public Triangle(double width, double length) {
        super(length);
        this.width = width;
    }

    @Override
    public double calculationOfArea() {
        result = (length * width) / 2;
        return result;
    }

    @Override
    public double calculationOfPyrimeter() {
        result = length + (width * 2);
        return result;
    }

    @Override
    public String getName() {
        return name;
    }
}
