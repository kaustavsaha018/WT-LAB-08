class plate{
    double length,width;
    plate(double lenght, double width){
        this.length=lenght;
        this.width=width;
        System.out.println("Length and Width has been set from plate Constructor");
    }
}
class box extends plate{
    double height;
    box(double length, double width, double height){
        super(length,width);
        this.height=height;
        System.out.println("Height has been set from box Constructor");
    }
}
class woodBox extends box{
    double thick;
    woodBox(double length, double width, double height, double thick){
        super(length,width,height);
        this.thick=thick;
        System.out.println("Thick has been set from woodBox Constructor");
    }
    public void display(){
        System.out.println("Length = "+length);
        System.out.println("Width = "+width);
        System.out.println("Height = "+height);
        System.out.println("Thick = "+thick);
    }
}
public class Q2 {
    public static void main(String[] args) {
       woodBox wb1 = new woodBox(1.5,2.5,4.5,9.8);  
       wb1.display();
    }    
}