package org.example;

import java.util.HashMap;

public class PlayerFactory {
    private static final HashMap<PlayerType, Player> map = new HashMap<>();
    public static Player getPlayer(PlayerType player) {
        Player p = null;
        if(map.containsKey(player)) {
            p = map.get(player);
        } else {
            switch(player) {
                case TERRORIST:
                    System.out.println("Create new Terrorist");
                    p = new Terrorist();
                    break;
                case COUNTER_TERRORIST:
                    System.out.println("Create new Counter-Terrorist");
                    p = new CounterTerrorist();
                    break;
                default:
                    System.out.println("Unreachable player");
            }
            map.put(player, p);
        }
        return p;
    }
}
