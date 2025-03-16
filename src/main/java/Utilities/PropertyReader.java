package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

    public static  String readKey(String key) throws IOException {

        try {
            FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/data.properties");

            Properties p = new Properties();
            p.load(fileInputStream);
            System.out.println(key);
            return p.getProperty(key);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
