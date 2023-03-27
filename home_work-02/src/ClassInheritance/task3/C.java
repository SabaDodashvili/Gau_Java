package ClassInheritance.task3;

public class C extends B{
    public double z = 3.15;
    public double r = 7.20;

    public double method5(){
        return Math.max(Math.max(x,y), Math.max(z, r));
    }
}