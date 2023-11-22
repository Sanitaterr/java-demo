package com.jzy.test;

import com.jzy.test.homework.work_before_11_3.RegexDemo;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

/**
 * a + b
 *
 * @author jzy
 */
@SpringBootApplication
public class TestApplication {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        IOTest ioTest = new IOTest();
//        ioTest.f();

//        CrawlerTest crawlerTest = new CrawlerTest();
//        crawlerTest.f();

        RegexDemo regexDemo = new RegexDemo();
        regexDemo.f();

//        GoodsManage goodsManage = new GoodsManage();
//
//        // 添加货物组1
//        GoodsGroup goodsGroup1 = new GoodsGroup();
//        goodsGroup1.addGoods(new Goods("商品1", 10.0, 5));
//        goodsGroup1.addGoods(new Goods("商品2", 20.0, 3));
//        goodsManage.addGoodsGroup(goodsGroup1);
//
//        // 添加货物组2
//        GoodsGroup goodsGroup2 = new GoodsGroup();
//        goodsGroup2.addGoods(new Goods("商品3", 30.0, 2));
//        goodsGroup2.addGoods(new Goods("商品4", 40.0, 1));
//        goodsManage.addGoodsGroup(goodsGroup2);
//
//        // 输出所有货物信息
//        for (int i = 0; i < goodsManage.getSize(); i++) {
//            GoodsGroup goodsGroup = goodsManage.getGoodsGroup(i);
//            System.out.println("货物组" + (i + 1) + "，共" + goodsGroup.getSize() + "件货物，总价值：" + goodsGroup.getTotalPrice());
//            for (int j = 0; j < goodsGroup.getSize(); j++) {
//                Goods goods = goodsGroup.getGoods(j);
//                System.out.println("编号：" + goods.getNumber() + "，名称：" + goods.getName() + "，单价：" + goods.getPrice() + "，数量：" + goods.getQuantity() + "，总价：" + goods.getTotalPrice());
//            }
//        }
//
//        // 输出所有货物组的总价值
//        System.out.println("所有货物组的总价值：" + goodsManage.getTotalPrice());
    }

    public static Integer subtraction(Integer a, Integer b) {
        return a - b;
    }
}