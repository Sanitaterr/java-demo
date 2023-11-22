package com.jzy.test.homework.work_before_11_3;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author jzy
 */
public class FileTest {
    public void f() throws IOException {
//        File f1 = new File("D:\\stream-file\\ccc\\c.txt");
//        boolean b = f1.createNewFile();
//        System.out.println(b);

//        File f2 = new File("D:\\stream-file\\aaa\\bbb");
//        boolean b = f2.mkdir();
//        System.out.println(b);

//        File f3 = new File("D:\\stream-file\\aaa\\bbb");
//        boolean b = f3.mkdirs();
//        System.out.println(b);

//        File f4 = new File("D:\\stream-file\\a.txt");
//        boolean b = f4.delete();
//        System.out.println(b);
//
//        File f5 = new File("D:\\stream-file\\aaa");
//        File[] files = f5.listFiles();
//        if (files != null) {
//            for (File file : files) {
//                System.out.println(file);
//            }
//        }

//        File f6 = new File("D:\\stream-file\\aaa");
//        String[] arr1 = f6.list();
//        if (arr1 != null) {
//            for (String s : arr1) {
//                System.out.println(s);
//            }
//        }

//        File f7 = new File("D:\\stream-file\\aaa");
//        String[] arr2 = f7.list(new FilenameFilter() {
//            @Override
//            public boolean accept(File file, String s) {
//                File src = new File(file, s);
//                return src.isFile() && s.endsWith(".txt");
//            }
//        });
//        System.out.println(Arrays.toString(arr2));

        findTxt();

    }

    public void findTxt() {
        File[] arr = File.listRoots();
        for (File f : arr) {
            findTxt(f);
        }
    }

    public void findTxt(File src) {
        File[] files = src.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    if (file.getName().endsWith(".mp4")) {
                        System.out.println(file);
                    }
                } else {
                    findTxt(file);
                }
            }
        }
    }
}
