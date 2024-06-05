package Data_Structure.Tree;

public class Main {
    public static void main(String[] args) {

        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        
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