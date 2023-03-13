package Project1;

import java.util.Scanner;

public class A {
    private int a;
    private int b;

    public void method1(){
        Scanner scan = new Scanner(System.in);

        System.out.println("a: ");
        a = scan.nextInt();
        System.out.println("b: ");
        b = scan.nextInt();

        scan.close();
    }

    public void method2(){
        System.out.println(a + b);
    }

    public int method3(){
        return a * b;
    }
}
