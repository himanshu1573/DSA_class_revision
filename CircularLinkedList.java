class CNode{
    int data;
    CNode next;
    public CNode(int data){
        this.data=data;
        this.next=null;
    }
}
class CircularLinkedList {
    CNode head;
    public void insert(int data){
        CNode newNode= new CNode(data);
        if(head==null){
           head=newNode;
           newNode.next=head;
        }else{
            CNode temp=head;
            while(temp.next!=head){
                temp=temp.next;
            }
            temp.next=newNode;
            newNode.next=head;
        }
    }
    public void display(){
        if(head==null){
            System.out.println("null");
        }else{
            CNode temp=head;
            do{
                System.out.print(temp.data);
               
                if(temp.next != head){
                    System.out.print(" --> ");
                }
                temp= temp.next;
            }while(temp!=head);
          System.out.println();
        }
    }
    public void delete(int data){
        if(head==null){
            System.out.println("list is already empty");
            return;
        }
        CNode temp=head;
        CNode previous=null;
        do{
            if(temp.data==data){
                break;
            }
            previous=temp;
            temp=temp.next;
        }while(temp!=head);
        if(temp==head){
            CNode last=head;
            while(last.next!=head){
                last=last.next;
            }
            if(head==last){
                head=null;
            }else if(temp.data!=data){
                System.out.println("not found");
            }
            else{
                head=head.next;
                last.next=head;
            }
        }
        else{
            previous.next=temp.next;
        }
    }
    
    public static void main(String args[]){
        CircularLinkedList circle= new CircularLinkedList();
        circle.insert(1);
        circle.insert(2);
        circle.insert(2);
        circle.insert(2);
        circle.insert(2);
        circle.display();
        circle.delete(3);
        circle.display();
      
    }
}