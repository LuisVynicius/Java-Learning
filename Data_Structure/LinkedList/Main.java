package Data_Structure.LinkedList;

public class Main {
    public static void main(String[] args) {

        Long ft = System.currentTimeMillis();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
        System.out.println("Tempo01: " + (System.currentTimeMillis() - ft));
        
        Long st = System.currentTimeMillis();
        java.util.LinkedList<Integer> list2 =  new java.util.LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            list2.add(i);
        }
        System.out.println("Tempo02: " + (System.currentTimeMillis() - st));
        
    }
}
