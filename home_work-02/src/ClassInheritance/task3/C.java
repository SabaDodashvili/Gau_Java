package ClassInheritance.task3;

public class C extends B {
    boolean z;
    boolean r;

//    public boolean method7() {
//        return x > y && x > z && x > r;
//    }

    public int method8() {
        return x * y * (z ? 1 : 0) * (r ? 1 : 0);
    }

    public int method9() {
        A a = new A();
        a.method1();
        return x + a.y;
    }
}