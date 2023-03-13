package Project1;

import java.util.Scanner;

public class B {
    private int a;
    private int b;
    private int c;

    public void method1(){
        Scanner scan = new Scanner(System.in);

        System.out.println("a: ");
        a = scan.nextInt();

        System.out.println("b: ");
        b = scan.nextInt();

        System.out.println("c: ");
        c = scan.nextInt();

        scan.close();
    }

    public void method2(){
        int max = Math.max(a,b);
        max = Math.max(max, c);

        System.out.println(max);
    }

    public int method3(){
        int min = Math.min(a,b);
        min = Math.min(min, c);

        return min;
    }
}
