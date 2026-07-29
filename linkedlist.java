class node{https://www.onlinegdb.com/#editor_1
    int data;https://www.onlinegdb.com/#editor_1
    node next;
    node(int data){
        this.data=data;
        this.next=null;
    }
}
public class linkedlist{
    static node head;
    static void insertEnd(int data)
    {
        node newnode=new node(data);
        if(head==null)
        {
            head=newnode ;
            return;
        }
        node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newnode;
    }
    static void display(){
        node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data+"");
            temp=temp.next;
        }
    }
    public static void main(String[]args){
        insertEnd(10);
        insertEnd(20);
        insertEnd(30);
        display();
    }
}
        
        
        
        
    
    
        
            
            
        
    
        
        
        
    
    
    
