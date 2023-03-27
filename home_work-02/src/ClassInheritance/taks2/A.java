package ClassInheritance.taks2;

import java.util.Scanner;

public class A {
//    public A(){
//
//    }

    public int x;
    public int y;

    public void method1(){
        Scanner scan = new Scanner(System.in);

        System.out.println("input x: ");
        this.x = scan.nextInt();

        System.out.println("input y");
        this.y = scan.nextInt();

        scan.close();
    }

    public void method2(){
        System.out.println("x - " + this.x);
    }


    public void method3(){
        System.out.println("y - " + this.y);
    }
}