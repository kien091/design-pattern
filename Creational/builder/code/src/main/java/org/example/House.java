package org.example;

public class House {
    private final int walls;
    private final int doors;
    private final boolean hasPool;
    private final boolean hasRoof;
    private final String color;

    public House(int walls, int doors, boolean hasPool, boolean hasRoof, String color) {
        this.walls = walls;
        this.doors = doors;
        this.hasPool = hasPool;
        this.hasRoof = hasRoof;
        this.color = color;
    }

    @Override
    public String toString() {
        return "House{" +
                "walls=" + walls +
                ", doors=" + doors +
                ", hasPool=" + hasPool +
                ", hasRoof=" + hasRoof +
                ", color='" + color + '\'' +
                '}';
    }
}
