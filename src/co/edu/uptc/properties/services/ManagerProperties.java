package co.edu.uptc.properties.services;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class  test{
    private Properties properties = new Properties();
    private String fileName = "config.propertiesw";

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void load () {
        try {
            properties.load(new FileInputStream(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    
    }
    
    public String getValue (String key) {
        if (properties.isEmpty()) {
            load();
        }
       return properties.getProperty(key); 
    }

}