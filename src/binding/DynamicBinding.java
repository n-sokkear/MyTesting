package binding;

public class DynamicBinding extends Object{
    @Override
    public String toString() {
        return "Person";
    }

    public static void displayObject(Object obj) {
        System.out.println(obj.toString());
    }
}
class Students extends DynamicBinding{
    @Override
    public String toString() {
        return "Student";
    }
}
class GraduateStudent extends Students{
    @Override
    public String toString() {
        return "GraduateStudent";
    }
}

