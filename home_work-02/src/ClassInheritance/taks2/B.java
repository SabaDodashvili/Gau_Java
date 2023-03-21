package ClassInheritance.taks2;

public class B extends A {
    public B(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int method4() {
        return y - x;
    }

    public int method5() {
        return x + (2 * y);
    }
}
