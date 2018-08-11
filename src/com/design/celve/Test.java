package com.design.celve;

import com.design.celve.weaponBehavior.AxeWeaponBehaviorImpl;
import com.design.celve.weaponBehavior.ExcaliburWeaponBehaviorBehaviorImpl;

public class Test {
    public static void main(String[] args) {
        // 实例话了一个国王角色
        Character king = new King();
        // 角色发起战斗技能
        king.fight();

        // 角色更换武器行为
        king.setWeaponBehavior(new AxeWeaponBehaviorImpl());
        // 角色再次发起战斗技能
        king.fight();

        // 拔出石中剑，信仰加持
        king.setWeaponBehavior(new ExcaliburWeaponBehaviorBehaviorImpl());
        // 发动宝具技能
        king.fight();

    }
}
