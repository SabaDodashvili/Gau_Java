package classConstructorExamples;

public class C {
    public float x, y;

    public C() {}

    public C(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public boolean method1() {
        return x < 0;
    }

    public float method2() {
        if(x<y) return x;
        return y;
    }
}