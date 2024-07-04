package Data_Structure.Misc;

public class Node<T> {
    private Node<T> leftNode;
    private T value;
    private Node<T> rightNode;
    
    public Node(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public Node<T> getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node<T> node) {
        this.leftNode = node;
    }

    public Node<T> getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node<T> node) {
        this.rightNode = node;
    }

}