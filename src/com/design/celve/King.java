package com.design.celve;

import com.design.celve.weaponBehavior.NoBehavior;

/**
 * 国王角色
 */
public class King extends Character {

    public King() {
        weaponBehavior = new NoBehavior();
    }
}
