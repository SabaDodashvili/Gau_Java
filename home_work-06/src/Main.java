import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        task1();
//        task2();
//        task3();
//        task4();
//        task5();
        task6();
    }
    public static void task1(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isPolydrome(number)) {
            System.out.println(number + " is a polydrome.");
        } else {
            System.out.println(number + " is not a polydrome.");
        }
    }

    public static boolean isPolydrome(int number) {
        int reverse = 0;
        int original = number;

        while (original > 0) {
            int digit = original % 10;
            reverse = reverse * 10 + digit;
            original /= 10;
        }

        return (reverse == number);
    }
    public static void task2(){
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.print("Enter five integers: ");

        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        Arrays.sort(numbers);

        if (numbers[0] == numbers[2]) {
            System.out.println(numbers[3] + " " + numbers[4]);
        } else if (numbers[1] == numbers[3]) {
            System.out.println(numbers[0] + " " + numbers[4]);
        } else if (numbers[2] == numbers[4]) {
            System.out.println(numbers[0] + " " + numbers[1]);
        } else {
            System.out.println("NO");
        }
    }
    public static void task3(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        double inverse = 1.0 / number;
        double result = 2.0 * inverse;

        System.out.printf("%.2f", result);
    }
    public static void task4(){
        int a = 1;
        int b = 10;
        double[][] matrix = new double[6][5];

        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = a + (b - a) * random.nextDouble();
            }
        }

        System.out.println("Original matrix:");
        printMatrix(matrix);

        Arrays.sort(matrix, (aRow, bRow) -> Double.compare(bRow[0], aRow[0]));

        double[][] sortedMatrix = new double[6][5];
        for (int i = 0; i < 6; i++) {
            int shift = (int) matrix[i][4];
            for (int j = 0; j < 5; j++) {
                sortedMatrix[i][(j + shift) % 5] = matrix[i][j];
            }
        }

        System.out.println("Sorted matrix:");
        printMatrix(sortedMatrix);
    }

    public static void printMatrix(double[][] matrix) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%8.2f ", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void task5(){
        int[] array = new int[100];

        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            array[i] = random.nextInt(100);
        }

        int middle = array.length / 2;
        for (int i = 0; i < middle; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > i) {
                count++;
            }
        }

        System.out.println(Arrays.toString(array));
        System.out.println("Count: " + count);
    }
    public static void task6(){
        Scanner scanner = new Scanner(System.in);

        double usdRate = 1.7710;
        double eurRate = 2.2700;
        double gbpRate = 2.8950;

        System.out.print("Enter the amount to convert: ");
        double amount = scanner.nextDouble();

        System.out.print("Enter the currency to convert (USD/EUR/GBP): ");
        String currency = scanner.next().toUpperCase();

        double result;
        switch (currency) {
            case "USD":
                result = amount * usdRate;
                break;
            case "EUR":
                result = amount * eurRate;
                break;
            case "GBP":
                result = amount * gbpRate;
                break;
            default:
                System.out.println("Invalid currency");
                return;
        }

        System.out.printf("%.2f %s = %.2f GEL\n", amount, currency, result);
    }
}