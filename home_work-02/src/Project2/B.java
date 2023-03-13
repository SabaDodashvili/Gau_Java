package Project2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class B {
    private double[] m = new double[12];

    public void method1(){
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < m.length; i++) {
            System.out.println("enter " + i + " index element: ");
            m[i] = scan.nextDouble();
        }

        scan.close();
    }

    public void method2(){
        Random rand = new Random();
        double randomNum;

        for (int i = 0; i < m.length; i++) {
            randomNum = rand.nextDouble(15);
            m[i] = randomNum;
        }

        String mToString = Arrays.toString(m);
        System.out.println(mToString);
    }

    public void method3(){
        for (int i = 0; i < m.length; i++) {
            if (m[i] > 7){
                System.out.println(m[i]);
            }
        }
    }

    public double method4(){
        double min = Arrays.stream(m).min().getAsDouble();
        double max = Arrays.stream(m).max().getAsDouble();

        return max - min;
    }
}
