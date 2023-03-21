package ClassInheritance.task4;

import java.util.Scanner;
import java.util.Random;

public class A {
    double x, y;

    public void method1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x: ");
        x = scanner.nextDouble();
        System.out.print("Enter y: ");
        y = scanner.nextDouble();
    }

    public void method2() {
        Random random = new Random();
        x = random.nextDouble() * 12;
        y = random.nextDouble() * 12;
    }

    public void method3() {
        System.out.println("x = " + x + ", y = " + y);
    }
}