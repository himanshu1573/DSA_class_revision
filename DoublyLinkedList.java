class Dnode{
    int data;
    Dnode next;
    Dnode pre;
    public Dnode(int data){
        this.data=data;
        this.next=null;
        this.pre=null;
    }
}
class DoublyLinkedList {
    Dnode head;
    Dnode tail;
    public boolean empty(){
        return head==null;
    }
    public void addStart(int data){
        Dnode newNode=new Dnode(data);
        if(empty()){
            head=newNode;
            tail=newNode;
        }else{
            newNode.next=head;
            head.pre=newNode;
            head=newNode;
        }
    }
    public void StartTraverse(){
        Dnode temp=head;
        if(!empty()){
            System.out.print("null <-->");
        }
        while(temp!=null){
            System.out.print(temp.data+"<-->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void addEnd(int data){
        Dnode newNode= new Dnode(data);
        if(empty()){
            head=newNode;
            tail=newNode;
        }else{
            tail.next=newNode;
            newNode.pre=tail;
            tail=newNode;
        }
    }
    public void EndTraverse(){
        Dnode temp=tail;
        if(!empty()){
            System.out.print("null");
        }
        while(temp!=null){
            System.out.print("<-->"+temp.data);
            temp=temp.pre;
        }
        System.out.println("<-->null");

    }
    public void delete(int data){
        if(empty()){
            System.out.println("list is empty");
            return;
        }
        Dnode temp=head;
        while(temp!=null&&temp.data!=data){
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("element not found"); 
            return;
        }
        if(temp.pre==null&&temp.next==null){
            head=null;
            tail=null;
            // head=tail=null;
        }
        else if(temp.pre==null){
            head=head.next;
            head.pre=null;
            return;
        }else if(temp.next==null){
           tail=tail.pre;
           tail.next=null;
        }
        else{
            temp.pre.next=temp.next;
            temp.next.pre=temp.pre;
        }
    }
    public static void main(String args[]){
        DoublyLinkedList list= new DoublyLinkedList();
        // list.addStart(1);
        // list.addEnd(5);
        list.addEnd(6);
        // list.StartTraverse();
        list.delete(6);
        list.StartTraverse();
        // list.EndTraverse();
    }
}