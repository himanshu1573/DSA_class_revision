class CirNode{
    int data;
    CirNode next;
    public CirNode(int data){
        this.data=data;
        this.next=null;
    }
}
class Check {
    CirNode head;
    public void insert(int data){
        CirNode newNode= new CirNode(data);
        if(head==null){
            head=newNode;
            newNode.next=head;
        }else{
            CirNode temp=head;
            while(temp.next!=head){
                temp=temp.next;
            }
            temp.next=newNode;
            newNode.next=head;
        }
    }
    public void display(){
        if(head==null){
            System.out.println("it's empty");
            return;
        }else{
            CirNode temp= head;
            do{
                System.out.print(temp.data+"-->");
                temp=temp.next;
            }while(temp!=head);
        }
    }
    public void delete(int data) {
        if (head == null) {
            System.out.println("The list is empty. Deletion is not possible.");
            return;
        }
        CirNode current = head, prev = null;
        do {
            if (current.data == data) {
                break;
            }
            prev = current;
            current = current.next;
        } while (current != head);
        if (current == head) {
            if (current.next == head) {
                head = null;
            } else {  
                prev = head;
                while (prev.next != head) {
                    prev = prev.next;
                }
                head = head.next;
                prev.next = head;
            }
        } else {
            prev.next = current.next;
        }

        System.out.println("Node with data " + data + " deleted.");
    }
    public void update(int oldData, int newData) {
        if (head == null) {
            System.out.println("The list is empty. Update is not possible.");
            return;
        }

        CirNode current = head;
        do {
            if (current.data == oldData) {
                current.data = newData;
                System.out.println("Node data updated from " + oldData + " to " + newData + ".");
                return;
            }
            current = current.next;
        } while (current != head);

        System.out.println("Node with data " + oldData + " not found. Update failed.");
    }
    public void reverse() {
        if (head == null || head.next == head) {
            return;
        }

        CirNode prev = null;
        CirNode current = head;
        CirNode nextNode;
        do {
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        } while (current != head);
        head = prev;
    }
    public static void main(String args[]){
          Check circle= new Check();
          circle.insert(2);
          circle.insert(3);
          circle.insert(4);
          circle.insert(5);
          circle.insert(6);
          circle.display();
    }
}