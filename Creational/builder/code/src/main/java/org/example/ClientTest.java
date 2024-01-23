package org.example;

public class ClientTest {
    public static void main(String[] args) {
        House house = new HouseBuilder()
                .setWalls(4)
                .setDoors(2)
                .setHasPool(true)
                .setHasRoof(true)
                .setColor("red")
                .build();

        House house2 = new HouseBuilder()
                .setWalls(3)
                .setDoors(1)
                .setHasPool(false)
                .build();

        System.out.println(house);
        System.out.println(house2);
    }
}