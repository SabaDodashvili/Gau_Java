package ClassConstructors;

public class Class1 {
    private int x;

    public Class1(int x) {
        this.x = x;
        System.out.println("hello my class");
    }

    public void method1() {
        if(x%2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
