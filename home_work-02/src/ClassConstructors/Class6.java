package ClassConstructors;

public class Class6 {
    private float x;
    private float y;

    Class6(){}
    Class6(float x){
        this.x = x;
    }
    Class6(float x, float y){
        this.x = x;
        this.x = y;
    }

    public float method1() {
        return this.gcd(x, y);
    }

    public float method2() {
        return (x * y) / this.gcd(x, y);
    }

    private float gcd(float a, float b) {
        if (a < b) return gcd(b, a);

        if (Math.abs(b) < 0.001)
            return a;
        else
            return (gcd(b, a - (float)Math.floor(a / b) * b));
    }
}
