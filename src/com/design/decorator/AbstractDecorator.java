package com.design.decorator;

/*
 *
 * 抽象的装饰者
 *
 */
public class AbstractDecorator implements Hero{
    
    //持有一个英雄对象接口
    private Hero hero;


    public AbstractDecorator(Hero hero) {
        this.hero = hero;
    }

    @Override
    public void outHeroInfo() {
        hero.outHeroInfo();
    }
}