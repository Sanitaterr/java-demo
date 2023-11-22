package com.jzy.test.reflect.test4;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Properties prop = new Properties();
        prop.put("message", "success");
        prop.put("aaa", "bbb");
        prop.put("ccc", "ddd");
        prop.put("eee", "fff");
        prop.put("ggg", "hhh");
        System.out.println(prop);

//        Set<Object> keySet = prop.keySet();
//        for (Object o : keySet) {
//            System.out.println(o);
//        }

        Set<Map.Entry<Object, Object>> entries = prop.entrySet();
        for (Map.Entry<Object, Object> entry : entries) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            System.out.println(key + "=" + value);
        }
    }
}
