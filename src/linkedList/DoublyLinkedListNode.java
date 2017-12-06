package linkedList;

public class DoublyLinkedListNode {

    private int num;
    private DoublyLinkedListNode previousNOde;
    private DoublyLinkedListNode nextNode;

    public DoublyLinkedListNode(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public DoublyLinkedListNode getPreviousNOde() {
        return previousNOde;
    }

    public void setPreviousNOde(DoublyLinkedListNode previousNOde) {
        this.previousNOde = previousNOde;
    }

    public DoublyLinkedListNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(DoublyLinkedListNode nextNode) {
        this.nextNode = nextNode;
    }
}
