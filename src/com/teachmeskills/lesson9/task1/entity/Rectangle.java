package com.teachmeskills.lesson9.task1.entity;

public final class Rectangle extends Figure {

    public String name = "Rectangle";
    double wigth;
    double result;
    

    public Rectangle(double wigth, double length) {
        super(length);
        this.wigth = wigth;
    }

    @Override
    public double calculationOfArea() {
        result = wigth * length;
        return result;
    }

    @Override
    public double calculationOfPyrimeter() {
        result = (wigth * 2) + (length * 2);
        return result;
    }

    @Override
    public String getName() {
        return name;
    }
}
