package com.design.decorator;

//ConcreteComponent 具体的英雄
public class Garen implements Hero {


    @Override
    public void outHeroInfo() {
        System.out.println("我就是那个小盖伦仔");
    }
}

