package Java_Utilities.Read_And_Write.Buffered.Writer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    
    public static void main(String[] args) throws IOException {
        File file = new File("Java_Utilities\\Read_And_Write\\file.txt");
        
        FileWriter fw = new FileWriter(file, false);
        BufferedWriter bw = new BufferedWriter(fw);

        for (int i = 1; i <= 15; i++) {
            bw.append("Line " + i + "\n");
        }

        bw.close();
        fw.close();
    }
}
