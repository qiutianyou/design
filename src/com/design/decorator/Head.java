package com.design.decorator;

//ConreteDecorator 技能：W
public class Head extends AbstractDecorator {

    public Head(Hero hero) {
        super(hero);
    }

    @Override
    public void outHeroInfo() {
        System.out.println("英俊面容，头戴金冠");
        super.outHeroInfo();
    }
}