package org.example;

public class ClientTest {
    public static void main(String[] args) {
        Developer dev1 = new Developer("1", "Dev 1", 20, 1000, Position.DEVELOPER);
        Developer dev2 = new Developer("2", "Dev 2", 21, 1000, Position.DEVELOPER);
        Leader leader1 = new Leader("5", "Leader 1", 24, 1000, Position.LEADER);
        leader1.add(dev1);
        leader1.add(dev2);

        Developer dev3 = new Developer("7", "Dev 3", 26, 1000, Position.DEVELOPER);
        Developer dev4 = new Developer("8", "Dev 4", 27, 1000, Position.DEVELOPER);
        Leader leader2 = new Leader("6", "Leader 2", 25, 1000, Position.LEADER);
        leader2.add(dev3);
        leader2.add(dev4);

        BusinessAnalyst ba1 = new BusinessAnalyst("3", "BA 1", 22, 1000, Position.BUSINESS_ANALYST);
        BusinessAnalyst ba2 = new BusinessAnalyst("4", "BA 2", 23, 1000, Position.BUSINESS_ANALYST);

        Boss boss = new Boss("11", "Boss", 30, 1000, Position.BOSS);
        boss.add(leader1);
        boss.add(leader2);
        boss.add(ba1);
        boss.add(ba2);
        boss.print();
    }
}