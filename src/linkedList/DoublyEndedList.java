package linkedList;

public class DoublyEndedList {

    private Node head;
    private Node tail;

    public void insertAtHead(int num) {
        Node newNode = new Node(num);
        newNode.setNextNode(this.head);
        this.head = newNode;
    }

    public void insertAtTail(int num) {
        Node newNode = new Node(num);
        if(this.head == null) {
            this.head = newNode;
        }

        if(this.tail != null) {
            this.tail.setNextNode(newNode);
        }

        this.tail = newNode;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("{");

        Node current = this.head;
        while (current != null) {
            res.append(current.getNum());
            res.append(", ");
            current = current.getNextNode();
        }

        res.append("}");
        return res.toString();
    }
}
