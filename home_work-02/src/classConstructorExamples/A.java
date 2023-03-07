package classConstructorExamples;

public class A {
    public int x;

    public A(int x) {
        this.x = x;
        System.out.println("hello my Class");
    }

    public String method1() {
        String result;
        if(x%2 == 0) {
            result = "event";
        } else {
            result = "odd";
        }
        return result;
    }
}