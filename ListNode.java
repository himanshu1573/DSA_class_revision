class Node{
   int data;
   Node next;
   public Node(int data){
       this.data=data;
       this.next=null;
   } 
}
class ListNode {
    Node head;
    public void append(int data){
         Node newNode= new Node(data);
         if(head==null){
            head=newNode;
         }else{
            Node dup=head;
            while(dup.next!=null){
                dup=dup.next;
            }
            dup.next=newNode;
         }
    }
    public void display(){
        if(head==null){
            System.out.println("empty");
        }else{
            Node dup=head;
            while(dup!=null){
                System.out.print(dup.data+"->");
                dup=dup.next;
            }
            System.out.println("null");

        }
    }
    public void deleteNode(int data){
        if(head==null){
            return;
        }
        if(head.data==data){
            head=head.next;
            return;
        }
        Node dummy=head;
        while(dummy.next!=null&&dummy.next.data!=data){
            dummy=dummy.next;
        }
        if(dummy.next!=null){
            dummy.next=dummy.next.next;
        }else{
            System.out.println("element not found");
        }
    }
    public void addStart(int data){
        Node newNode= new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public static void main(String args[]){
        ListNode linklist= new ListNode();
        linklist.append(1);
        linklist.append(2);
        linklist.append(3);
        linklist.display();
        linklist.addStart(4);
        linklist.display();
        linklist.deleteNode(4);
        linklist.display();
    }

}