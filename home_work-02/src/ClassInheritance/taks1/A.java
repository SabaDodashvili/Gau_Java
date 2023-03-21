package ClassInheritance.taks1;

import java.util.Scanner;

public class A {
    public int x;

    public A(){
        System.out.println("hello My A Class");
    }

    public void method1(){
        Scanner scan = new Scanner(System.in);

        System.out.println("enter x value: ");
        this.x = scan.nextInt();

//        scan.close();
    }

    public void method2(){
        System.out.println("x - " + this.x);
    }

    public void method3(){
        if(x%2 == 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
}
