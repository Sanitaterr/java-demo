package com.jzy.test.homework.work_before_11_3;

import java.util.ArrayList;

/**
 * @author jzy
 */
public class GoodsManage {
    private ArrayList<GoodsGroup> goodsGroups;

    public GoodsManage() {
        goodsGroups = new ArrayList<>();
    }

    public void addGoodsGroup(GoodsGroup goodsGroup) {
        goodsGroups.add(goodsGroup);
    }

    public void removeGoodsGroup(GoodsGroup goodsGroup) {
        goodsGroups.remove(goodsGroup);
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (GoodsGroup goodsGroup : goodsGroups) {
            totalPrice += goodsGroup.getTotalPrice();
        }
        return totalPrice;
    }

    public int getSize() {
        return goodsGroups.size();
    }

    public GoodsGroup getGoodsGroup(int index) {
        return goodsGroups.get(index);
    }
}
