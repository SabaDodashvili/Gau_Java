package Project2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class A {
    private int[] m = new int[10];

    public void method1(){
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < m.length; i++) {
            System.out.println("enter " + i + " index element: ");
            m[i] = scan.nextInt();
        }

        scan.close();
    }

    public void method2(){
        Random rand = new Random();
        int randomNum;

        for (int i = 0; i < m.length; i++) {
            randomNum = rand.nextInt(16 );
            m[i] = randomNum;
        }

//        String mToString = Arrays.toString(m);
//        System.out.println(mToString);
    }

    public int method3(){
        int sum = 0;

        for (int i = 0; i < m.length; i++) {
            if (m[i] < i){
                sum += m[i];
            }
        }

        return sum;
    }

    public int method4(){
        int multi = 1;

        for (int i = 1; i < m.length; i++) {
            if (m[i] > i){
                multi *= i;
            }
        }

        return multi;
    }
}
