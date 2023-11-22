package com.jzy.test.homework.work_before_11_3;

/**
 * 矩形类
 * @author jzy
 */
public class Rectangle {
    private double width;
    private double height;

    public Rectangle() {
        this.width = 1;
        this.height = 1;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }
}
/*
Market（超市类）：用于表示超市，具有扫描和添加商品的功能；
Product（商品类）：用于表示商品，具有名称和价格两个属性；
Buyer（购物者类）：用于表示购物者，具有选购和判断商品是否在超市中的功能。
                  +--------------+
                  |    Market    |
                  +--------------+
                  | scan()       |
                  | addProduct() |
                  +------+-------+
                         |
        +----------------+----------------+
        |                                 |
+---------------+                  +--------------+
| Product       |                  | Buyer        |
+---------------+                  +--------------+
| -name: String |                  |              |
| -price: double|                  |              |
|               |                  | +choose()    |
|               |                  | +isInMarket()|
+---------------+                  |              |
                                   +--------------+
*/