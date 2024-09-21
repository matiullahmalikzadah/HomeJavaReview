package Class19;

import java.io.FileWriter;
import java.io.IOException;

public class E6CreatingFiles {
    public static void main(String[] args) throws IOException {

        FileWriter f=new FileWriter("Test.txt");
        f.write("batch 17 is the best ");
        f.close();
    }
}
