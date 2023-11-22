package com.jzy.test.reflect.test4;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Test2 {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();

        prop.put("aaa", "bbb");
        prop.put("bbb", "bbb");
        prop.put("ccc", "bbb");
        prop.put("ddd", "bbb");

//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\SpringBoot\\test\\test2.txt"));
//        Set<Map.Entry<Object, Object>> entries = prop.entrySet();
//        for (Map.Entry<Object, Object> entry : entries) {
//            Object key = entry.getKey();
//            Object value = entry.getValue();
//            bufferedWriter.write(key + "=" + value);
//            bufferedWriter.newLine();
//        }
//        bufferedWriter.close();

        FileOutputStream fileOutputStream = new FileOutputStream("D:\\SpringBoot\\test\\test2.txt");
        prop.store(fileOutputStream, "test2");
        fileOutputStream.close();
    }
}
