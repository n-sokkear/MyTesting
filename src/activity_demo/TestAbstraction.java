package activity_demo;

import Util.Utils;
import adstract_pakage.GeometricObject;
import model.Circle;
import model.Ractangle;

public class TestAbstraction {
    public static void main(String[] args) {
        GeometricObject ref1 = new Circle(1.5, "Green" , true);
        GeometricObject ref2 = new Circle(1.5, "Green", true);
        GeometricObject ref3 = new Ractangle(1.8,2.3,"Blue",true);
        Utils.showMessage(ref1.getArea());
        Utils.showMessage(ref1.getPerimater());
        Utils.showMessage(ref3.getArea());
        Utils.showMessage(ref3.getPerimater());

        displayGeometricObject(ref1);
        displayGeometricObject(ref2);
        displayGeometricObject(ref3);


    }
    public static void displayGeometricObject(GeometricObject object){
        Utils.showMessage(object.getArea());
        Utils.showMessage(object.getPerimater());
        System.out.println(object.toString());
    }
}
