package ClassInheritance.task3;

import java.util.Scanner;

public class A {
    public int x;
    public int y;

    public void method1(){
        Scanner scan = new Scanner(System.in);
        System.out.println("input x: ");
        this.x = scan.nextInt();

        System.out.println("input y: ");
        this.y = scan.nextInt();

        scan.close();
    }

    public void method2(){
         this.x = (int) (Math.random() * (78 - 12)) + 12;
         this.y = (int) (Math.random() * (78 - 12)) + 12;
    }

    public void method3(){
        System.out.println(this.y);
    }
}