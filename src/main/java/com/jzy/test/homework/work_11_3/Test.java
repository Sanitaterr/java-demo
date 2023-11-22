package com.jzy.test.homework.work_11_3;

/**
 * @author jzy
 */
public class Test {
    public static void main(String[] args) {
        SuperHero superHero = new SuperHero("SuperHero", "维护世界和平", "打败洛基");
        System.out.println(superHero);
        IronMan ironMan = new IronMan("IronMan", "科学家", "保护世界和平", "飞行装置");
        Hulk hulk = new Hulk("Hulk", "实验员", "打败敌人", "超强臂力");

        ironMan.introduce();
        hulk.introduce();
    }
}
