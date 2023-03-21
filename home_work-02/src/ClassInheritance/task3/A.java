package ClassInheritance.task3;

import java.util.Random;
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
        Random rand = new Random();
        x = rand.nextInt(67) + 12;
        y = rand.nextInt(67) + 12;
    }

    public void method3() {
        System.out.println("y: " + y);
    }
}