package ClassInheritance.taks2;

public class C extends B {
    int z;

    public C(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public double method6() {
        return (x + y + z) / 3.0;
    }

    public double method7() {
        return Math.cbrt(x * y * z);
    }

    public int method8() {
        return Math.max(Math.max(x, y), z);
    }
}