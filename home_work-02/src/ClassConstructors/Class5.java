package ClassConstructors;

public class Class5 {
    private Float x;
    private Float y;

    public Class5(){}
    public Class5(Float x){
        this.x = x;
    }

    public boolean method1(){
        return x<0;
    }

    public float method2(float y){
        if (x>y){
            return y;
        }
        return x;
    }
}
