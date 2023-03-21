package ClassInheritance.taks2;

import java.util.Scanner;

public class A {
    int x;
    int y;

    public void method1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        x = sc.nextInt();
        System.out.print("Enter y: ");
        y = sc.nextInt();
    }

    public void method2() {
        System.out.println("x: " + x);
    }

    public void method3() {
        System.out.println("y: " + y);
    }
}
