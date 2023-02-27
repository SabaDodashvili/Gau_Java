
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class Main {
    public static void task1(){
        System.out.println("C++ \nC# \njava \npascal \nphp \nJavaScript \nActionScript");
    }

    public static void task2(){
        Scanner scan = new Scanner(System.in);

        System.out.println("input first number: ");
        int num1 = scan.nextInt();
        System.out.println("input second number: ");
        int num2 = scan.nextInt();

        System.out.println("first result: " + num1 / num2);
        System.out.println("second result: " + num2 % num1);

        scan.close();
    }

    public static void task3 (){
        Scanner scan = new Scanner(System.in);

        System.out.println("input first number: ");
        int num1 = scan.nextInt();
        System.out.println("input second number: ");
        int num2 = scan.nextInt();
        System.out.println("input third number: ");
        int num3 = scan.nextInt();

        int sum = num1 + num2 + num3;
        int multi = num1 * num2 * num3;
        System.out.println("sum: " + sum + "\n" + "multi: " + multi);

        scan.close();
    }

    public static void task4 (){
        Scanner scan = new Scanner(System.in);
        String num = scan.nextLine();

        System.out.println(num.charAt(0) + "\n" + num.charAt(1) + "\n" + num.charAt(2));

        scan.close();
    }

    public static void task5 (){
        Scanner scan = new Scanner(System.in);

        String num = scan.nextLine();

        System.out.println(num.charAt(0) + "\n" + num.charAt(1) + "\n" + num.charAt(2) + "\n" + num.charAt(3));

        scan.close();
    }

    public static void task6 (){
        Scanner scan = new Scanner(System.in);

        String num = scan.nextLine();

        int sum = 0;

        for (int i = 0; i < num.length(); i++) {
            int currentNum = Character.digit(num.charAt(i), 10); // char-ის ინტში გადაყვანა
            sum += currentNum;
        }

        System.out.println(sum);

        scan.close();
    }

    private static int gcd(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return gcd(num2, num1 % num2);
    }

    public static void task7 (){
        Scanner scan = new Scanner(System.in);

        System.out.println("input num1: ");
        int num1 = scan.nextInt();
        System.out.println("input num2: ");
        int num2 = scan.nextInt();

        System.out.println("GCD: " + gcd(num1, num2));
        System.out.println("LMC: " + num1*num2/gcd(num1, num2));

        scan.close();
    }

    public static void task8 (){
        Scanner scan = new Scanner(System.in);

        System.out.println("input num1: ");
        int num1 = scan.nextInt();
        System.out.println("input num2: ");
        int num2 = scan.nextInt();

        for (int i = num1; i < num2; i++) {
            System.out.println(i);
        }

        scan.close();
    }

    public static void task9 (){
        Random rd = new Random();

        double[] arr = new double[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextDouble();
            System.out.print(arr[i] + ' ');
        }

        System.out.println();
        System.out.println("max: " + Arrays.stream(arr).max().getAsDouble());
        System.out.println("min: " + Arrays.stream(arr).min().getAsDouble());
    }
    public static void task10 (){
        double[] arr = {7.3, 2.6, 5.1, 9.4, 1.0, 8.2, 4.7, 3.9};
        Arrays.sort(arr);
        System.out.println("Sorted Array:");
        for (double num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void task11 (){
        double[] arr = new double[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random();
        }
        System.out.println("Random Array:");
        for (double num : arr) {
            System.out.print(num + " ");
        }
    }
    public static void task12 (){
        Random rd = new Random();
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt();
            System.out.print(arr[i] + ' ');
        }
        System.out.println();

        Arrays.sort(arr);
        System.out.println(arr.toString());
    }
    public  static void main (String[] args){
//        task1();
//        task2();
//        task3();
//        task4();
//        task5();
//        task6();
//        task7();
//        task8();
//        task9();
//        task10();
//        task11();
//        task12();
    }
}
