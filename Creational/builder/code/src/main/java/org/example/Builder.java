package org.example;

public interface Builder {
    Builder setWalls(int walls);
    Builder setDoors(int doors);
    Builder setHasPool(boolean hasPool);
    Builder setHasRoof(boolean hasRoof);
    Builder setColor(String color);
    House build();
}
