package model;

import adstract_pakage.GeometricObject;

public class Circle extends GeometricObject {
    private double radius;

    public Circle() {
        radius = 0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        setColor(color);
        setFilled(filled);
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }



    @Override
    public double getPerimater() {
        return 2 * Math.PI * radius;
    }

    public double getDiamenter(){
        return 2 * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius + super.toString() +
                '}';
    }
}
