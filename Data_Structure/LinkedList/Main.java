package Data_Structure.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.getLenght());
        System.out.println("Get: " + list.get(0));
    }
}
