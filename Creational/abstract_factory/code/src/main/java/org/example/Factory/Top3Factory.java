package org.example.Factory;

import org.example.Medal.Bronze;
import org.example.Medal.Medal;
import org.example.Prize.Prize;
import org.example.Prize.ThirdPrize;

public class Top3Factory implements LevelAbstractFactory{
    @Override
    public Prize getPrize() {
        return new ThirdPrize();
    }

    @Override
    public Medal getMedal() {
        return new Bronze();
    }
}
