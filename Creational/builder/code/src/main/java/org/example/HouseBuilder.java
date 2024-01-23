package org.example;

public class HouseBuilder implements Builder{
    private int walls;
    private int doors;
    private boolean hasPool;
    private boolean hasRoof;
    private String color;
    @Override
    public Builder setWalls(int walls) {
        this.walls = walls;
        return this;
    }

    @Override
    public Builder setDoors(int doors) {
        this.doors = doors;
        return this;
    }

    @Override
    public Builder setHasPool(boolean hasPool) {
        this.hasPool = hasPool;
        return this;
    }

    @Override
    public Builder setHasRoof(boolean hasRoof) {
        this.hasRoof = hasRoof;
        return this;
    }

    @Override
    public Builder setColor(String color) {
        this.color = color;
        return this;
    }

    @Override
    public House build() {
        return new House(walls, doors, hasPool, hasRoof, color);
    }
}
