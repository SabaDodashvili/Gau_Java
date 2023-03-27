package ClassInheritance.task3;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        a.method1();
        a.method2();
        a.method3();

        B b = new B();
        b.method2();
        b.method4();

        C c = new C();
        c.method2();
        System.out.println(c.method5());

    }
}
