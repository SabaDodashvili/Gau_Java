package ClassInheritance.taks2;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        a.method1();
        a.method2();
        a.method3();

        B b = new B(5,5);
        System.out.println(b.method4());
        System.out.println(b.method5());

        C c = new C(5, 10, 15);
        System.out.println(c.method6());
        System.out.println(c.method7());
        System.out.println(c.method8());

    }
}
