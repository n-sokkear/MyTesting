package Exame;

public class ExamMain {
    public static void main(String[] args) {
        class One{
            public void process(){
                System.out.println("Parent");
            }
        }
        class Two extends One{
            public void process(){
                super.process();
                System.out.println("Child");
            }
        }

        One one = new Two();
        one.process();
    }
}
