import java.util.Objects;

public class BinarySearchTree {
    public static void main(String[] args) {

        Tree<Integer> tree = new Tree<>();
        
        //Head
        tree.addValue(20);
        //Left_Side
        tree.addValue(14);
        tree.addValue(12);
        tree.addValue(16);
        tree.addValue(13);
        tree.addValue(15);
        tree.addValue(11);
        tree.addValue(17);
        //Right_Side
        tree.addValue(26);
        tree.addValue(24);
        tree.addValue(28);
        tree.addValue(23);
        tree.addValue(25);
        tree.addValue(27);
        tree.addValue(29);

        System.out.println(" Contains: " + ((tree.contains(25)) ? "Yes":"No"));
    }
}

class Tree<T extends Comparable<T>> {
    
    protected class Node {
        private Node leftNode;
        private T value;
        private Node rightNode;
        
        public Node(T value) {
            this.value = value;
        }

        public T getValue() {
            return value;
        }

        public Node getLeftNode() {
            return leftNode;
        }

        public void setLeftNode(Node node) {
            this.leftNode = node;
        }

        public Node getRightNode() {
            return rightNode;
        }

        public void setRightNode(Node node) {
            this.rightNode = node;
        }
        
    }

    private Node nodeHead;
    
    public void addValue(T value) {
        if (Objects.isNull(nodeHead)) {
            nodeHead = new Node(value);
        } else {
            Node newNode = new Node(value);
            Node currentNode = nodeHead;
            while (true) {
                if (newNode.getValue().compareTo(currentNode.getValue())==-1) {
                    if (Objects.isNull(currentNode.getLeftNode())) {
                        currentNode.setLeftNode(newNode);
                        break;
                    } else {
                        currentNode = currentNode.getLeftNode();
                    }
                } else {
                    if (Objects.isNull(currentNode.getRightNode())) {
                        currentNode.setRightNode(newNode);
                        break;
                    } else {
                        currentNode = currentNode.getRightNode();
                    }
                }
            }
        }
    }

    public boolean contains(T value) {
        Node currentNode = nodeHead;

        while (Objects.nonNull(currentNode)) {
            int ct = value.compareTo(currentNode.getValue());
            if (ct==0) {
                return true;
            } else if (ct==-1) {
                currentNode = currentNode.getLeftNode();
            } else {
                currentNode = currentNode.getRightNode();
            }
        }
        return false;
    }

    public Node getHead() {
        return nodeHead;
    }
}

