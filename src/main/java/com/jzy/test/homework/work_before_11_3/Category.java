package com.jzy.test.homework.work_before_11_3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jzy
 */
public class Category {
    private final String categoryName;
    /**
     * 货物大类
     */
    private List<Goods> members;

    public Category(String categoryName) {
        this.categoryName = categoryName;
        members = new ArrayList<>();
    }

    public void add(Goods goods) {
        members.add(goods);
    }

    public String getCategoryName() {
        return this.categoryName;
    }

    public List<Goods> getMembers() {
        return this.members;
    }
}
