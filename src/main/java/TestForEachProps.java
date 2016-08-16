import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestForEachProps {
    public static void main(String[] args) {
        Properties property = new Properties();

        try (FileInputStream fis = new FileInputStream("src\\main\\resources\\config.properties")){
            property.load(fis);

//            String host = property.getProperty("db.host");
//            String login = property.getProperty("db.login");
//            String password = property.getProperty("db.password");

//            System.out.println("HOST: " + host
//                    + ", LOGIN: " + login
//                    + ", PASSWORD: " + password);

            for (String key : property.stringPropertyNames()){
                String value = property.getProperty(key);
                System.out.println(key + " => " + value);
            }
            fis.close();
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
