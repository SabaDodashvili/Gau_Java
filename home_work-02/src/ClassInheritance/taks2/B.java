package ClassInheritance.taks2;

public class B extends A{
    public B(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int method4(){
        return this.x - this.y;
    }

    public int method5(){
        return this.x + 2 * this.y;
    }
}