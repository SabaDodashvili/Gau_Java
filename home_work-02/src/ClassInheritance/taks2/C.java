package ClassInheritance.taks2;

public class C extends B{
    double z;

    public C(int x, int y, double z) {
        super(x, y);
        this.z = z;
    }

    public double method6(){

        return (x + y + z) / 3;
    }

    public double method7(){
        return Math.sqrt(x * y * z);
    }

    public double method8(){
        return Math.max(Math.max(x, y), z);
    }
}
