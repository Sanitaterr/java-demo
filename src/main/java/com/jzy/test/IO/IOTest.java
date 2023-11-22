package com.jzy.test.IO;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/**
 * windows换行符：\r\n
 * Linux：\n
 * Mac：\r
 * @author jzy
 */
public class IOTest {
    public void f() throws IOException, ClassNotFoundException {
//        FileOutputStream fileOutputStream = new FileOutputStream("a.txt", true);
//        fileOutputStream.write("Hello jzy!\r\n".getBytes());
//        fileOutputStream.write("666\r\nv  ".getBytes());
//        fileOutputStream.close();

//        FileInputStream fileInputStream = new FileInputStream("a.txt");
//        int b;
//        while ((b = fileInputStream.read()) != -1) {
//            System.out.print((char)b);
//        }
//        fileInputStream.close();

//        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\l\\Pictures\\smy.jpg");
//        FileOutputStream fileOutputStream = new FileOutputStream("copy.jpg");
//        int b;
//        while ((b = fileInputStream.read()) != -1) {
//            fileOutputStream.write(b);
//        }
//
//        fileOutputStream.close();
//        fileInputStream.close();

//        FileInputStream fileInputStream = new FileInputStream("a.txt");
//        byte[] bytes = new byte[6];
//
//        int len = fileInputStream.read(bytes);
//        System.out.println("len: " + len);
//        System.out.println(new String(bytes, 0, len));
//
//        len = fileInputStream.read(bytes);
//        System.out.println("len: " + len);
//        System.out.println(new String(bytes, 0, len));
//
//        len = fileInputStream.read(bytes);
//        System.out.println("len: " + len);
//        System.out.println(new String(bytes, 0, len));
//
//        fileInputStream.close();

//        try (FileInputStream fileInputStream = new FileInputStream("C:\\Users\\l\\Pictures\\smy.jpg");
//             FileOutputStream fileOutputStream = new FileOutputStream("copy.jpg");) {
//            long start = System.currentTimeMillis();
//
//            int len;
//            byte[] bytes = new byte[1024 * 1024 * 5];
//            while ((len = fileInputStream.read(bytes)) != -1) {
//                fileOutputStream.write(bytes, 0, len);
//            }
//            long end = System.currentTimeMillis();
//            System.out.println(end - start + "ms");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

//        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("a.txt"));;
//        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("copy.txt"));
//        byte[] bytes = new byte[1024];
//        int len;
//        while ((len = bufferedInputStream.read(bytes)) != -1) {
//            bufferedOutputStream.write(bytes, 0, len);
//        }
//        bufferedOutputStream.close();
//        bufferedInputStream.close();

//        BufferedReader bufferedReader = new BufferedReader(new FileReader("a.txt"));
//        String line = null;
//        while ((line = bufferedReader.readLine()) != null) {
//            System.out.println(line);
//        }
//        bufferedReader.close();


//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("b.txt", true));
//        bufferedWriter.write("123");
//        bufferedWriter.newLine();
//        bufferedWriter.write("345");
//        bufferedWriter.newLine();
//        bufferedWriter.close();

//        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("b.txt"), "GBK");
//        int ch;
//        while ((ch = inputStreamReader.read()) != -1) {
//            System.out.print((char)ch);
//        }
//        inputStreamReader.close();

        //jdk 11
//        FileReader fileReader = new FileReader("b.txt", Charset.forName("UTF-8"));
//        int ch;
//        while ((ch = fileReader.read()) != -1) {
//            System.out.print((char)ch);
//        }
//        fileReader.close();

//        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream("b.txt"), "GBK");
//        outputStreamWriter.write("夜来幽梦忽还乡");
//        outputStreamWriter.close();

//        FileWriter fileWriter = new FileWriter("b.txt", Charset.forName("GBK"));
//        fileWriter.write("夜来幽梦忽还乡");
//        fileWriter.close();

        //jdk11之前
//        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("b.txt"), "GBK");
//        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream("d.txt"), "UTF-8");
//
//        int b;
//        while ((b = inputStreamReader.read()) != -1) {
//            outputStreamWriter.write(b);
//        }
//        outputStreamWriter.close();
//        inputStreamReader.close();

        //jdk11之后
//        FileReader fileReader = new FileReader("b.txt", Charset.forName("GBK"));
//        FileWriter fileWriter = new FileWriter("d.txt", Charset.forName("UTF-8"));
//        int b;
//        while ((b = fileReader.read()) != -1) {
//            fileWriter.write(b);
//        }
//        fileWriter.close();
//        fileReader.close();

        // 利用字节流读取文件中的数据，每次读一整行，而且不能出现乱码
//         FileInputStream fileInputStream = new FileInputStream("a.txt");
//         InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
//         BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
//         String str = bufferedReader.readLine();
//         System.out.println(str);
//         bufferedReader.close();

//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("a.txt")));
//        String line;
//        while ((line = bufferedReader.readLine()) != null) {
//            System.out.println(line);
//        }
//        bufferedReader.close();

        // 序列化流
//        Student student = new Student("Tom", 23, "杭州");
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("b.txt"));
//        objectOutputStream.writeObject(student);
//        objectOutputStream.close();

        // 反序列化流
//        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("b.txt"));
//        Student o = (Student) objectInputStream.readObject();
//        System.out.println(o);
//        objectInputStream.close();
        // 打印流只读不写
        // 字节打印流，默认自动刷新，特有的println自动换行
//        PrintStream printStream = new PrintStream(new FileOutputStream("c.txt"), true, "UTF-8");

        // 字符打印流，自自动刷新需要开启，特有的println自动换行
//        PrintWriter printWriter = new PrintWriter(new FileWriter("c.txt"), true);
//        printWriter.println("十年生死两茫茫");
//        printWriter.print("不思量 ");
//        printWriter.println("自难忘");

        // 打印流应用场景
        // 获取打印流的对象，此打印流在虚拟机启动的时候，由虚拟机创建，默认指向控制台
        // 系统中的标准输出流，是不能关闭的，在系统中是唯一的
        // System.out.close();
//        PrintStream printStream = System.out;
//        printStream.println("123");
//        System.out.println("123");

        // 压缩流
        // 解压
//        File src = new File("aaa.zip");
//        File dest = new File("index");
//        unzip(src, dest);

        // 压缩
        // 压缩单个文件
//        File src = new File("hello.txt");
//        File dest = new File("D:\\SpringBoot\\test");
//        toZip(src, dest);

        // 压缩文件夹
        File src = new File("aaa");
        File destParent = src.getParentFile();
        File dest = new File(destParent, src.getName() + ".zip");
        ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(dest));

        zipOutputStream.close();
    }

    public void toZipPlus(File src, ZipOutputStream zipOutputStream, String name) {

    }

    public void toZip(File src, File dest) throws IOException {
        ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(new File(dest, "hello.zip")));
        ZipEntry zipEntry = new ZipEntry(src.toString());
        zipOutputStream.putNextEntry(zipEntry);
        FileInputStream fileInputStream = new FileInputStream(src);
        int b;
        while ((b = fileInputStream.read()) != -1) {
            zipOutputStream.write(b);
        }
        zipOutputStream.closeEntry();
        zipOutputStream.close();
    }

    public void unzip(File src, File dest) throws IOException {
        ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(src));
        ZipEntry zipEntry = null;
        while ((zipEntry = zipInputStream.getNextEntry()) != null) {
            if (zipEntry.isDirectory()) {
                File file = new File(dest, zipEntry.toString());
                file.mkdirs();
            } else {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(dest, zipEntry.toString()));
                int b;
                while ((b = zipInputStream.read()) != -1) {
                    fileOutputStream.write(b);
                }
                fileOutputStream.close();
                // 表示压缩包里的一个文件处理完毕了
                zipInputStream.closeEntry();
            }
        }
        zipInputStream.close();
    }
}