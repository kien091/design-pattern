package org.example.Factory;

import org.example.Medal.Medal;
import org.example.Medal.Silver;
import org.example.Prize.Prize;
import org.example.Prize.SecondPrize;

public class Top2Factory implements LevelAbstractFactory{
    @Override
    public Prize getPrize() {
        return new SecondPrize();
    }

    @Override
    public Medal getMedal() {
        return new Silver();
    }
}
