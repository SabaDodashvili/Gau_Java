package ClassInheritance.taks2;

public class Main {
    public static void main(String[] args) {
    A a = new A();
    a.method1();
    a.method2();
    a.method3();

    B b = new B(5, 8);
    b.method4();
    b.method5();

    C c = new C(23,42,23);
    c.method6();
    c.method7();
    c.method8();
    }
}
