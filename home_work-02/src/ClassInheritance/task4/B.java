package ClassInheritance.task4;

import java.util.Scanner;

public class B extends A{
    public double a;
    public double b;

    public void method4(){
        Scanner scan = new Scanner(System.in);
        System.out.println("input a: ");
        this.a = scan.nextInt();

        System.out.println("input b: ");
        this.b = scan.nextInt();

        scan.close();
    }

    public void method5(){
        if (a > b){
            double temp = a;
            a = b;
            b = temp;
        }
    }

    public void method6(int a, int b){
        this.x = (int) (Math.random() * (b - a)) + a;
        System.out.println(x);
    }
}