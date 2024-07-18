package algorithms.Longest_Common.SubSequence;

public class Main {
    
    public static void main(String[] args) {
        String word01 = " grama";
        String word02 = " programação";

        int[][] table = new int[word01.length()][word02.length()];
        for (int l = 1; l < word01.length(); l++) {
            for (int c = 1; c < word02.length(); c++) {
                if (word01.charAt(l) == word02.charAt(c)) {
                    table[l][c] = table[l - 1][c - 1] + 1;
                } else {
                    table[l][c] = (table[l - 1][c] > table[l][c - 1]) ? table[l - 1][c] : table[l][c - 1];
                }
            }
        }

        for (int[] lines : table) {
            for (int item : lines) {
                System.out.print(item + " ");
            }
            System.out.println();
        }

        System.out.println("Result: " + table[table.length - 1][table[0].length - 1]);
    }

}
