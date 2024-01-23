package org.example.Factory;

import org.example.Medal.Medal;
import org.example.Prize.Prize;

public interface LevelAbstractFactory {
    public Prize getPrize();
    public Medal getMedal();
}
