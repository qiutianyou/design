package com.design.celve;

import com.design.celve.weaponBehavior.WeaponBehavior;

/**
 * 角色的抽象类
 */
public  class Character {

    protected WeaponBehavior weaponBehavior;

     void fight(){
         weaponBehavior.useWeapon();
     };

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
}
