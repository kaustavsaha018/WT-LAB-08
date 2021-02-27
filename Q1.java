class twoDimension{
    public double x,y,cost;
    twoDimension(double x, double y){
        this.x=x;
        this.y=y;
       
    }
    public void setCost(double cost){
        this.cost=cost;
    }
    public double calculateArea(){
        setCost(40*x*y);
        return x*y;
    }
    public void showCost(){
        System.out.println("The cost of the plastic is: Rs. "+cost);
    }
}
class threeDimension extends twoDimension{
    double z;
    threeDimension(double x, double y, double z){
        super(x,y);
        this.z=z;
        
    }

    @Override 
    public double calculateArea(){
        setCost(60*x*y*z);
        return x*y*z;
    } 
    
}
public class Q1 {
    public static void main(String[] args) {
        twoDimension obj1 = new twoDimension(1,2);
        obj1.calculateArea();
        obj1.showCost();

        threeDimension obj2 = new threeDimension(1,2,3);
        obj2.calculateArea();
        obj2.showCost();
        
    }
}
