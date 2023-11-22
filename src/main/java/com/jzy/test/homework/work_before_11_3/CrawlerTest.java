package com.jzy.test.homework.work_before_11_3;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlerTest {
    public void f() throws IOException {
        String s1 = "https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&from=kg0";
        String s2 = "http://www.haoming8.cn/baobao/10881.html";
        String s3 = "http://www.haoming8.cn/baobao/46363.html";

        String str1 = webCrawler(s1);
        String str2 = webCrawler(s2);
        String str3 = webCrawler(s3);

        ArrayList<String> data1 = getData(str1, "(.{4})(，|。)", 1);
        System.out.println(data1);
    }

    public ArrayList<String> getData(String str, String regex, int index) {
        ArrayList<String> list = new ArrayList<>();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            list.add(matcher.group(index));
        }
        return list;
    }

    public String webCrawler(String net) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        URL url = new URL(net);
        URLConnection urlConnection = url.openConnection();
        InputStreamReader inputStreamReader = new InputStreamReader(urlConnection.getInputStream());
        int ch;
        while ((ch = inputStreamReader.read()) != -1) {
            stringBuilder.append((char)ch);
        }
        inputStreamReader.close();
        return stringBuilder.toString();
    }
}
