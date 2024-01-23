package org.example;

public class CounterTerrorist implements Player{
    // intrinsic attribute
    private final String TASK;

    // extrinsic attribute
    private WeaponType weapon;

    public CounterTerrorist() {
        this.TASK = "DIFFUSE BOMB";
    }

    @Override
    public void assignWeapon(WeaponType weapon) {
        this.weapon = weapon;
    }

    @Override
    public void mission() {
        System.out.println("Counter Terrorist with weapon "
                + weapon + "|" + " Task is " + TASK);
    }
}
