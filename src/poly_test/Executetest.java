package poly_test;

public class Executetest {
    public static void main(String[] args) {
        Parent a = new Subclass1();
        a.print();
        a = new SubClass2();
        a.print();

        int b = 10;
        double c = (double)b;
        System.out.println(c);
    }
}
