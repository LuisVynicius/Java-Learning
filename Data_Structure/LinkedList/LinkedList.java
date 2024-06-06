package Data_Structure.LinkedList;

import java.util.Objects;

public class LinkedList<T>{

    protected class Node {
        private T value;
        private Node nextNode;

        public Node(T value) {
            this.value = value;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public Node getNextNode() {
            return nextNode;
        }

        public void setNextNode(Node nextNode) {
            this.nextNode = nextNode;
        }
        
    }

    private Node firstNode;
    private Node lastNode;
    private int lenght;

    public Node getFirstNode() {
        return firstNode;
    }

    public Node getLastNode() {
        return lastNode;
    }

    public int getLenght() {
        return lenght;
    }

    public boolean add(T value) {
        Node node = new Node(value);
        if (Objects.isNull(firstNode)) {
            this.firstNode = node;
            this.lastNode = node;
        } else {
            lastNode.setNextNode(node);
            this.lastNode = node;
        }
        lenght++;
        return true;
    }

    public Node get(int index) {
        Node current = firstNode;
        for (int i = 0; i < index; i++) {
            if (Objects.nonNull(current.getNextNode())) {
                current = current.getNextNode();
            }
        }
        return current;
    }

    public void remove(int index) {
        
        if (index < 0 || index >= lenght) {
            throw new IndexOutOfBoundsException("Erro");
        }
        
        Node prevNode = get(index-1);
        Node currentNode = prevNode.getNextNode();

        if (index == 0) {
            if (lenght > 1) {
                firstNode = firstNode.getNextNode();
            } else {
                prevNode.setNextNode(null);
                firstNode = null;
                lastNode = null;
            }
            lenght--;
            return;
        }

        prevNode.setNextNode(currentNode.getNextNode());

        if (Objects.isNull(prevNode.getNextNode())) {
            lastNode = prevNode;
        }
        lenght--;
    }
}