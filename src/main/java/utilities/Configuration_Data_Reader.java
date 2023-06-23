package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Data_Reader {

    // this function to get data from data driven (Configuration_Data)
    public static String getConfigData(String key){
        String filePath = System.getProperty("user.dir","UTF-8")+"//src//main//resources//Configuration_Data.properties";
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream(filePath));
        } catch (IOException e) {
            System.out.println("Configuration Data not exist");
            throw new RuntimeException(e);
        }
        return properties.getProperty(key);
    }
}
