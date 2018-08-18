package com.design.decorator;

//ConreteDecorator 技能：R
public class Identity extends AbstractDecorator {
    

    public Identity(Hero hero) {
        super(hero);
    }

    @Override
    public void outHeroInfo() {
        System.out.println("德玛西亚最帅的男子 —— 德玛西亚之力");
        super.outHeroInfo();
    }
}