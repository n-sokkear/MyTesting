package model;

import adstract_pakage.GeometricObject;

public class Ractangle extends GeometricObject {
    private double width;
    private double height;

    public Ractangle() {
        width = 0;
        height = 0;
    }

    public Ractangle(double width , double height) {
        this.width = width;
        this.height = height;
    }
    public Ractangle(double width ,double height, String color, boolean filled){
        super(color,filled);
        this.width = width;
        this.height = height;
    }
    public double getWidth(){
        return width;
    }
    public void  setWidth(double width){
        this.width = width;
    }
    public double getHeight(){
        return height;
    }
    public void  setHeight(double height){
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
        // return getWidth() * getHeight();
    }

    @Override
    public double getPerimater() {
        return (width + height) * 2;
    }

    @Override
    public String toString() {
        return "Ractangle{" +
                "width=" + width +
                ", height=" + height + super.toString() +
                '}';
    }
}
