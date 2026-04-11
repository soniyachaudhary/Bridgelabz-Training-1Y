package MultiThreading;

public class Runner {
    static void main(String[] args) {
        A a=new A();
        B b=new B();

        a.setPriority(10);
        b.setPriority(5);

        a.start();
        b.start();
    }
}
