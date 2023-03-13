package ClassConstructors;

public class Class3 {
    private int a;
    private int b;
    private int x;

    public Class3(){}
    public Class3(int a, int b){
        this.a = a;
        this.b = b;
    }

    public void method1(){
        if (a == b){
            System.out.println("no");
        }else {
            System.out.println("yes");
        }
    }

    public void method2(int x){
        this.x = x;

        if (x >= a && x <= b) {
            System.out.println("he is in range");
        }else{
            System.out.println("he's out of range");
        }
    }

}
