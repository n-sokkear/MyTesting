package binding;

public class MineDynamicbinding {
    public static void main(String[] args) {
        displayObject(new Students());
        displayObject(new DynamicBinding());
        displayObject(new GraduateStudent());
    }
    public static void displayObject(Object obj){
        System.out.println(obj.toString());

    }
}
