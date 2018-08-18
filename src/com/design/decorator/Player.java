package com.design.decorator;

/**
 *
 * 客户端：召唤师
 */
public class Player {
    public static void main(String[] args) {
        // 没有被任何修饰的英雄
        // Hero garen = new Garen();
        // garen.outHeroInfo();

        // 修饰后的盖伦
        Head after = new Head(new Body(new Identity(new Garen())));
        after.outHeroInfo();

    }
}