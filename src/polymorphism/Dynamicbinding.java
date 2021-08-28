package polymorphism;

class Person1 extends Object{
    @Override
    public String toString() {
        return "person";
    }

      }

class Student1 extends Person1 {
    public String toString(){
        return  "Students";
    }
}
class GraduateStudent extends Student1{
    @Override
    public String toString() {
        return super.toString();
    }
}
public class Dynamicbinding {
    public static void main(String[] args) {
        Object person = new Person1();
        Object student = new Student1();
        Object graduate = new GraduateStudent();
        Object object = new Object();
        displayObject(person);
        displayObject(graduate);
    }
    public static void displayObject(Object obj){
        System.out.println(obj.toString());
    }
}
