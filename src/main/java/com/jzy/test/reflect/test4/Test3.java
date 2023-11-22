package com.jzy.test.reflect.test4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Test3 {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        FileInputStream fileInputStream = new FileInputStream("D:\\SpringBoot\\test\\test2.txt");
        prop.load(fileInputStream);
        fileInputStream.close();

        System.out.println(prop);
    }
}
