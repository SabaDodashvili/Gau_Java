package ClassInheritance.taks1;

import java.util.Scanner;

public class B extends A{
    public int y = 5;

    public void method4(){
        Scanner scan = new Scanner(System.in);

        System.out.println("enter y value: ");
        this.y = scan.nextInt();

        scan.close();
    }

    public int method5(){
        return this.x + this.y;
    }
}
