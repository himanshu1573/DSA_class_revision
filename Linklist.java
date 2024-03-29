
public class Linklist{
  
    public static class Node{
            int data;
            Node next;
            Node(int data){
                this.data=data;
            }
    }

    public static class linklist{
        Node head=null;
        Node tail=null;
        void traversal(int data){
            Node temp=new Node(data);
            if(head==null){
                head=temp;
            }
            else{
                tail.next=temp;
            }
            tail=temp;
        }
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.println("null");
           
            }
            void insertAt(int idx,int data){
                Node newNode=new Node(data);
                Node temp=head;
                if(idx==0){
                    newNode.next=temp;
                    head=newNode;
                    return;
                }
                for(int i=0;i<idx-1;i++){
                    temp=temp.next;
                }
                newNode.next=temp.next;
                temp.next=newNode;
            }
            
        }
    public static void main(String[] args){
        linklist ll=new linklist();
        ll.traversal(1);
        ll.traversal(2);
        ll.traversal(3);
        ll.traversal(4);
        ll.insertAt(0,5);
        ll.display();

    }
}