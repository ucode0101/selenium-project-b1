package com.ucode_academy.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    // Create object of Properties class, and make private and static
    private static Properties properties = new Properties();

    static {
        // Store the path of the file as a string
        String path = "configuration.properties"; // we always want to make sure the file path

       try {
           // Create an object of FileInputStream and pass the file path
           FileInputStream file = new FileInputStream(path);
           // load the file into the properties object
           properties.load(file);
           // close the file
           file.close();

       } catch (IOException e){
           e.printStackTrace();
           // throw explicitly run time exception if the file was not found
           throw new RuntimeException("File path was not found");
       }
    }

    // custom method to get the property
    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
    }

}
