class mygrandpa{
    void display(){
        System.out.println("my grandpa is a farmer.");
    }
}
class mydaddy extends mygrandpa{
    void show(){
        System.out.println("my daddy is a busness man.");
    }
}
class me extends mydaddy{
    void display1(){
        System.out.println("l am a student");
    }
}
public class main{
    public static void main(String[] args){
        me obj=new me();
        obj.display();
        obj.show();
        obj.display1();
    }
}
    
    


    

    
