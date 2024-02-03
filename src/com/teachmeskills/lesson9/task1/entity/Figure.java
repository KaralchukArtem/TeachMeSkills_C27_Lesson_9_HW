package com.teachmeskills.lesson9.task1.entity;

public abstract sealed class Figure permits Circle,Rectangle,Rhombus,Square,Triangle{

    double length;

    public Figure(double length) {
        this.length = length;
    }

    public abstract double calculationOfArea();

    public abstract double calculationOfPyrimeter();
    public abstract String getName();

}
