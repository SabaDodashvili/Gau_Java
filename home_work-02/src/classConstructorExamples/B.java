package classConstructorExamples;

public class B {
    public int x;

    public B() {}

    public B(int x) {
        this.x = x;
    }

    public boolean method1() {
        if(x >= 5 && x <= 24) {
            return true;
        }
        return false;
    }
}