class Base{
    int x;
    Base(int x){
        this.x=x;
    }
}
class Derived extends Base{
    Derived(){
        super(3);
    }
    void display(){
        System.out.println("The value of x is: "+x);
    }
}
public class Q6 {
    public static void main(String[] args) {
        Derived d = new Derived();
        d.display();
    }
}
