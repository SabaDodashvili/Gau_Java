import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
//        task14();
        task15();


    }

    public static void task1(){
        String dirName = "myFiles";
        String fileName = "data.txt";

        int[] numsArr =  {24, 39, -90};

        try {
            new File(dirName).mkdir();
            File currentFile = new File(dirName, fileName);
            currentFile.createNewFile();

            FileWriter writer = new FileWriter(currentFile, false);

            for (int num : numsArr){
                writer.write(String.valueOf(num) + ", ");
            }

            writer.close();
        }catch (Exception ex){
            System.out.println(ex);
        }

    }
    public static void task2(){
        String dirName = "myFiles";
        String fileName = "data1.txt";

        try {
            new File(dirName).mkdir();
            File currentFile = new File(dirName, fileName);
            currentFile.createNewFile();

            FileWriter writer = new FileWriter(currentFile, false);

            for (int i = 0; i < 100; i++) {
                writer.write(i + "\n");
            }

            writer.close();
        }catch (Exception ex){
            System.out.println(ex);
        }
    }
    public static void task3(){
        String dirName = "myFiles1";
        new File(dirName).mkdir();

            for (int i = 0; i < 30; i++) {
                try {
                    File currentFile = new File(dirName, "data" + i);
                    currentFile.createNewFile();

                    FileWriter writer = new FileWriter(currentFile);
                    writer.write("programmer");
                    writer.close();
                } catch (Exception ex){
                    System.out.println(ex);
                }
            }
    }
    public static void task4(){
        String dirName = "myFiles2";
        new File(dirName).mkdir();

        for (int i = 0; i < 30; i++) {
            try {
                File currentFile = new File(dirName, "data" + i);
                currentFile.createNewFile();

                FileWriter writer = new FileWriter(currentFile);
                writer.write("programmer" + i);
                writer.close();
            } catch (Exception ex){
                System.out.println(ex);
            }
        }
    }
    public static void task5(){
        Scanner scan = new Scanner(System.in);

        System.out.println("enter the beginning of the range");
        int rangeStart = scan.nextInt();
        System.out.println("enter the beginning of the range");
        int rangeEnd = scan.nextInt();

        if(rangeStart > rangeEnd){
            int tempVariable = rangeStart;
            rangeStart = rangeEnd;
            rangeEnd = tempVariable;
        }


        String dirName = "myFiles";
        String fileName = "data2.txt";

        try {
            new File(dirName).mkdir();
            File currentFile = new File(dirName, fileName);
            currentFile.createNewFile();
            FileWriter writer = new FileWriter(currentFile);

            for (int i = 0; i < 100; i++) {
                int randomNumb = (int) (Math.random() * (rangeEnd - rangeStart)) + rangeStart;
                writer.write(randomNumb + "\n");
            }
            writer.close();
        }catch (Exception ex){
            System.out.println(ex);
        }
    }
    public static void task6(){
        Scanner scan = new Scanner(System.in);

        System.out.println("enter the beginning of the range");
        int rangeStart = scan.nextInt();
        System.out.println("enter the beginning of the range");
        int rangeEnd = scan.nextInt();

        if(rangeStart > rangeEnd){
            int tempVariable = rangeStart;
            rangeStart = rangeEnd;
            rangeEnd = tempVariable;
        }


        String dirName = "myFiles";
        String fileName = "data3.txt";

        try {
            new File(dirName).mkdir();
            File currentFile = new File(dirName, fileName);
            currentFile.createNewFile();
            FileWriter writer = new FileWriter(currentFile);

            for (int i = 0; i < 50; i++) {
                double randomNumb = (double) (Math.random() * (rangeEnd - rangeStart)) + rangeStart;
                writer.write(randomNumb + "\n");
            }
            writer.close();
        }catch (Exception ex){
            System.out.println(ex);
        }
    }
    public static void task7(){
        System.out.println("?");
    }
    public static void task8(){
        System.out.println("?");
    }
    public static void task9(){
        String dirName = "myFiles";
        new File(dirName).mkdir();
        try {
            for (int i = 0; i < 100; i++) {
                File currentFile = new File(dirName, String.valueOf(i) + ".txt");
                currentFile.createNewFile();
                FileWriter writer = new FileWriter(currentFile);
                writer.write(String.valueOf(i));
                writer.close();
            }

        }catch (Exception ex){
            System.out.println(ex);
        }
    }
    public static void task10(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = input.nextInt();
        input.close();

        String binary = Integer.toBinaryString(decimal);

        System.out.println("Binary equivalent: " + binary);
    }
    public static void task11(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryStr = scan.nextLine();

        int decimal = Integer.parseInt(binaryStr, 2);
        System.out.println("Decimal equivalent: " + decimal);
    }
    public static void task14(){
        int a = 50;
        int b = 100;

        String dirName = "myFiles3";
        String fileName = "numbers.txt";

        try {
            new File(dirName).mkdir();
            File currentFile = new File(dirName, fileName);
            currentFile.createNewFile();

            FileWriter writer = new FileWriter(currentFile);

            for (int i = a; i < b; i++) {
                writer.write(i + "\n");
            }
            writer.close();

            FileReader reader = new FileReader(currentFile);
            BufferedReader bufferedReader = new BufferedReader(reader);

            for (int i = 0; i < 10; i++) {
                String line = bufferedReader.readLine();
                int num = Integer.parseInt(line);

            }
        }catch (Exception ex){
            System.out.println(ex);
        }
    }
    public static void task15(){
        int m = 0;
        int n = 0;

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter the value of m (<=50): ");
            m = Integer.parseInt(br.readLine());
            System.out.print("Enter the value of n (<=50): ");
            n = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            PrintWriter writer = new PrintWriter("info.txt");

            Random random = new Random();
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    int num = random.nextInt(2);
                    writer.print(num + " ");
                }
                writer.println();
            }

            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("info.txt"));
            String line;

            int countZeros = 0;
            int countOnes = 0;

            while ((line = reader.readLine()) != null) {
                String[] values = line.split(" ");
                for (String value : values) {
                    if (value.equals("0")) {
                        countZeros++;
                    } else if (value.equals("1")) {
                        countOnes++;
                    }
                }
            }

            reader.close();

            System.out.println("Number of 0's: " + countZeros);
            System.out.println("Number of 1's: " + countOnes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}