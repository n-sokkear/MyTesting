package binding;

public class TestDatabinding {
    public static void main(String[] args) {
        double a = 10;
        double b = 20;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("A");
        a = b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("B ");
        b = 30;
        System.out.println("a = " + a);
        System.out.println("b = " + b);


    }
}
