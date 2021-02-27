class Account{
    int acc_no;
    double ammount;
    Account(int acc_no,double ammount){
        this.acc_no=acc_no;
        this.ammount=ammount;
    }
    public void display(){
        System.out.println("A/C: "+acc_no+"\nAmmount: Rs. "+ammount);
    }
}
class Person extends Account{
    String name,aadhar_no;
    Person(int acc_no,double ammount,String name, String aadhar_no){
        super(acc_no, ammount);
        this.name=name;
        this.aadhar_no=aadhar_no;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Name of Account Holder: "+name);
        System.out.println("Aadhar No. of Account Hodler: "+aadhar_no);
        System.out.println("\n---------------------------------------------------\n");
    }

}
public class Q5 {
    public static void main(String[] args) {
        Person p1 = new Person(123,100.50,"Kaustav Saha","ABC100");
        Person p2 = new Person(124,1000.23,"Manorma Madam","7Af996");
        Person p3 = new Person(125,5957.78,"Somenath Sir","86AY12");
        Person p4 = new Person(126,500.25,"Mithilesh Kumar","135AFQS2");
        Person p5 = new Person(127,429.64,"Jaydeep Bairagi","6687AFC8");
        
        p1.display(); 
        p2.display(); 
        p3.display(); 
        p4.display(); 
        p5.display(); 
    }
}
