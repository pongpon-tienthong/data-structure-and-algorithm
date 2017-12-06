package linkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.insertAtHead(1);
        linkedList.insertAtHead(2);
        linkedList.insertAtHead(3);
        linkedList.insertAtHead(4);
        linkedList.insertAtHead(5);
        linkedList.insertAtHead(6);
        linkedList.insertAtHead(7);
        linkedList.insertAtHead(8);
        linkedList.insertAtHead(9);
        linkedList.insertAtHead(10);

        linkedList.deleteFromHead();

        System.out.println(linkedList);
        System.out.println("Length: " + linkedList.length());
        System.out.println("Find 7: " + linkedList.find(7));
        System.out.println("Find 11: " + linkedList.find(11));
    }
}
