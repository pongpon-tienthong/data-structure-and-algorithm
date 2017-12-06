package linkedList;

public class LinkedList {
    private Node head;

    public void insertAtHead(int num) {
        Node newNode = new Node(num);
        newNode.setNextNode(this.head);
        this.head = newNode;
    }

    public int length() {
        int length = 0;
        Node current = this.head;

        while (current != null) {
            length++;
            current = current.getNextNode();
        }

        return length;
    }

    public void deleteFromHead() {
        this.head = this.head.getNextNode();
    }

    public Node find(int num) {
        Node current = this.head;

        while (current != null) {
            if(current.getNum() == num) {
                return current;
            }
            current = current.getNextNode();
        }

        return null;
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
