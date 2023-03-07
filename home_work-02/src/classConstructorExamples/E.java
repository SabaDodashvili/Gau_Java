package classConstructorExamples;

public class E {
    public float x, y;

    public E() {}

    public E(float x, float y) {
        this.x = x;
        this.y = y;
    }

    private float gcd(float a, float b) {
        if (a < b) return gcd(b, a);

        if (Math.abs(b) < 0.001)
            return a;
        else
            return (gcd(b, a - (float)Math.floor(a / b) * b));
    }

    public float method1() {
        return this.gcd(x, y);
    }

    public float method2() {
        return (x * y) / this.gcd(x, y);
    }
}