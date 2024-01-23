package org.example.Factory;

import org.example.Segment;

public class LevelFactory {
    public static LevelAbstractFactory getLevelFactory(Segment segment){
        return switch (segment) {
            case TOP1 -> new Top1Factory();
            case TOP2 -> new Top2Factory();
            case TOP3 -> new Top3Factory();
            default -> throw new IllegalStateException("Unexpected level: " + segment + " in LevelFactory");
        };
    }
}
