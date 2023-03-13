package ClassConstructors;

public class Class2 {
    private int x;

    public Class2(){}
    public Class2(int x){
        this.x = x;
    }

    public void method1(){
        if (x >= 5 && x <= 24){
            System.out.println("he is in range");
        }else{
            System.out.println("he's out of range");
        }
    }
}
