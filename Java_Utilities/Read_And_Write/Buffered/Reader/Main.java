package Java_Utilities.Read_And_Write.Buffered.Reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    
    public static void main(String[] args) throws IOException {
        File file = new File("Java_Utilities\\Read_And_Write\\file.txt");
        
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        String s;
        while ((s=br.readLine())!=null) {
            System.out.println(s);
        }
        br.close();
        fr.close();
    }
}
