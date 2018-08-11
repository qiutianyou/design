package com.design.celve.weaponBehavior;

import com.design.celve.weaponBehavior.WeaponBehavior;

public class NoBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("老子啥都没有，就靠一双手， 嘿～～ ");
    }
}
