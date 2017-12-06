package linkedList;

public class DoublyLinkedList {

    private DoublyLinkedListNode head;

    public void insertAtHead(int num) {
        DoublyLinkedListNode newNode = new DoublyLinkedListNode(num);
        newNode.setNextNode(this.head);
        if(this.head != null) {
            this.head.setPreviousNOde(newNode);
        }
        this.head = newNode;
    }

    public int length() {
        int length = 0;
        DoublyLinkedListNode current = this.head;

        while (current != null) {
            length++;
            current = current.getNextNode();
        }

        return length;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("{");

        DoublyLinkedListNode current = this.head;
        while (current != null) {
            res.append(current.getNum());
            res.append(", ");
            current = current.getNextNode();
        }

        res.append("}");
        return res.toString();
    }
}
