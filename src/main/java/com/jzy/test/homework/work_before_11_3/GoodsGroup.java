package com.jzy.test.homework.work_before_11_3;

import java.util.ArrayList;

/**
 * @author jzy
 */
public class GoodsGroup {
    private ArrayList<Goods> goodsList;

    public GoodsGroup() {
        goodsList = new ArrayList<>();
    }

    public void addGoods(Goods goods) {
        goodsList.add(goods);
    }

    public void removeGoods(Goods goods) {
        goodsList.remove(goods);
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (Goods goods : goodsList) {
            totalPrice += goods.getTotalPrice();
        }
        return totalPrice;
    }

    public int getSize() {
        return goodsList.size();
    }

    public Goods getGoods(int index) {
        return goodsList.get(index);
    }
}
