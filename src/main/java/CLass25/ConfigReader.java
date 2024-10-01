package CLass25;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static void main(String[] args) throws IOException {

        String path="C:\\Users\\malik\\IdeaProjects\\JavaReview\\files\\Cinfig.properties";
        System.out.println(path);
        // moves the file from permanent storage into the RAM.
        FileInputStream file=new FileInputStream(path);
        //That one class/Software that will assist us to read Write the data from the file.
        Properties properties=new Properties();
        properties.load(file);
        System.out.println(properties.get("userName"));
        System.out.println(properties.get("Password"));
        System.out.println(properties.get("URL"));



    }
}
