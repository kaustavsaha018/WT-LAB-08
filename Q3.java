class Animal {
    public void move() {
       System.out.println("Animals can move");
    }
 }
 
 class Dog extends Animal {
    @Override
    public void move() {
       System.out.println("Dogs can walk and run");
    }
 }
public class Q3 {   
    public static void main(String[] args) {
        Animal myDog = new Dog();                     
        myDog.move();               
    }
}
