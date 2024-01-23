package org.example;

import java.util.Random;

public class ClientTest {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Player player = PlayerFactory.getPlayer(getRandomPlayerType());
            player.assignWeapon(getRandomWeaponType());
            player.mission();
        }
    }

    public static PlayerType getRandomPlayerType(){
        Random random = new Random();
        int randInt = random.nextInt(PlayerType.values().length);
        return PlayerType.values()[randInt];
    }

    public static WeaponType getRandomWeaponType(){
        Random random = new Random();
        return WeaponType.values()[random.nextInt(WeaponType.values().length)];
    }
}