package classConstructorExamples;

public class Main {
    public static void main(String[] args) throws Exception {
        A c1 = new A(5);
        System.out.println(c1.method1());

        B c2 = new B(12);
        System.out.println(c2.method1());

        C c5 = new C(2.5f, 6.6f);
        System.out.println(c5.method1());
        System.out.println(c5.method2());

        E c6 = new E(2.5f, 6.5f);
        System.out.println(c6.method1());
        System.out.println(c6.method2());
    }
}
