package com.design.decorator;

//

/**
 *
 * ConreteDecorator 具体的装饰者对象
 * 技能：Q
 */
public class Body extends AbstractDecorator {
    
    private String skin;

    public Body(Hero hero) {
        super(hero);
    }

    @Override
    public void outHeroInfo() {
        System.out.println("威武的身躯，身穿盔甲");
        super.outHeroInfo();
    }
}