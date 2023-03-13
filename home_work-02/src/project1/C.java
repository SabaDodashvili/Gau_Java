package Project1;

import java.util.Scanner;

public class C {
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

    public int method2(){
        String num = Integer.toString(a);

        int lastDigit = Character.digit(num.charAt(num.length() - 1), 10);

        return lastDigit;
    }

    public int method3(){
        String num = Integer.toString(b);

        int firstDigit = Character.digit(num.charAt(0), 10);

        return firstDigit;
    }

    public int method4(){
        String num = Integer.toString(c);

        int sum = 0;

        for (int i = 0; i < num.length(); i++) {
            sum += Character.digit(num.charAt(i), 10);
        }

        return sum;
    }

    public int method5(){
      int multi = method2() * method3();

        System.out.println(multi);
        return multi;
    }

    public void method6(){
        int sum = method3() + method5();

        System.out.println(sum);
    }
}

