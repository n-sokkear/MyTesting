package Exame;

class One{
    void count(int i){
        System.out.println(0);
    }
}
public class Test extends One {

    public  void count(int j){
        System.out.println(1);
    }
    public static void main(String[] args) {
        One one = new Test();
        one.count(0);


    }
}
