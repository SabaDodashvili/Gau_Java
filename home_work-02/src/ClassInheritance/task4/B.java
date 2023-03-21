package ClassInheritance.task4;

import java.util.Random;
import java.util.Scanner;

public class B extends A {
    double a, b;

    public void method4() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        a = scanner.nextDouble();
        System.out.print("Enter b: ");
        b = scanner.nextDouble();
    }

    public void method5() {
        if (a > b) {
            double temp = a;
            a = b;
            b = temp;
        }
    }

    public void method6() {
        Random random = new Random();
        x = random.nextDouble() * 12;
    }
}