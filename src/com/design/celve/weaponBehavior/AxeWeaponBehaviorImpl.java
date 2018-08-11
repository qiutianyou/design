package com.design.celve.weaponBehavior;

import com.design.celve.weaponBehavior.WeaponBehavior;

/**
 * 斧头行为实现
 */
public class AxeWeaponBehaviorImpl implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("掏出了一把斧头  赫～ 赫～");
    }
}
