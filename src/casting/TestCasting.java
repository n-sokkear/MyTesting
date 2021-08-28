package casting;

public class TestCasting {
    public static void main(String[] args) {

        int a = 5;
        double b = (double) a;

        int x = 5;
        double y = x;

        System.out.println(a + y);

        Object o = new Object();
       Students students;

        System.out.println(o.toString());
    }
}
class Students {
    @Override
    public String toString() {
        return "This object students";
    }
}
