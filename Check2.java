class Node {
    int data;
    Node next;
    Node prev;
    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
class Check2 {
    Node head;
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
        } else {
            Node last = head.prev;
            last.next = newNode;
            newNode.prev = last;
            newNode.next = head;
            head.prev = newNode;
        }
    }
    public void display() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }
    public void delete(int data) {
        if (head == null) {
            System.out.println("The list is empty. Deletion is not possible.");
            return;
        }
        Node current = head;
        do {
            if (current.data == data) {
                break;
            }
            current = current.next;
        } while (current != head);
        if (current == head) {
            if (current.next == head) {
                head = null;
            } else {
                Node last = head.prev;
                head = head.next;
                head.prev = last;
                last.next = head;
            }
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }

        System.out.println("Node with data " + data + " deleted.");
    }
    public void update(int oldData, int newData) {
        if (head == null) {
            System.out.println("The list is empty. Update is not possible.");
            return;
        }
        Node current = head;
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

    public static void main(String[] args) {
        Check2 doublyCircularList = new Check2();
        doublyCircularList.insert(1);
        doublyCircularList.insert(2);
        doublyCircularList.insert(3);
        doublyCircularList.insert(4);
        System.out.println("Original Doubly Circular Linked List:");
        doublyCircularList.display();
        doublyCircularList.delete(2);
        doublyCircularList.display();
        doublyCircularList.update(3, 5);
        doublyCircularList.display();
    }
}
