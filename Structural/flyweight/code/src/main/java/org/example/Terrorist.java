package org.example;

public class Terrorist implements Player{
    // intrinsic attribute
    private final String TASK;

    // extrinsic attribute
    private WeaponType weapon;

    public Terrorist() {
        this.TASK = "PLANT A BOMB";
    }

    @Override
    public void assignWeapon(WeaponType weapon) {
        this.weapon = weapon;
    }

    @Override
    public void mission() {
        System.out.println("Terrorist with weapon "
                + weapon + "|" + " Task is " + TASK);
    }
}
