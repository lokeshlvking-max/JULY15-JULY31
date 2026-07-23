class Parents{
    void display(){
        System.out.println("This is the Parent class.");
    }
}
class child extends Parents{
    void show(){
        System.out.println("This is the child class.");
    }
}
public class inheritance{
    public static void main(String[] args){
        child obj=new child();
        obj.display();
        obj.show();
    }
