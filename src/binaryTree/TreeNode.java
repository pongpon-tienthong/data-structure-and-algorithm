package binaryTree;

public class TreeNode {

    private Integer data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode(Integer data) {
        this.data = data;
    }

    public TreeNode find(Integer data) {
        if(this.data == data) {
            return this;
        }

        if(data < this.data && leftChild != null) {
            return leftChild.find(data);
        }

        if(rightChild != null) {
            return rightChild.find(data);
        }

        return null;
    }

    public int getData() {
        return data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }
}
