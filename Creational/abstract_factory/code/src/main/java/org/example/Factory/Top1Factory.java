package org.example.Factory;

import org.example.Medal.Gold;
import org.example.Medal.Medal;
import org.example.Prize.FirstPrize;
import org.example.Prize.Prize;

public class Top1Factory implements LevelAbstractFactory{

    @Override
    public Prize getPrize() {
        return new FirstPrize();
    }

    @Override
    public Medal getMedal() {
        return new Gold();
    }
}
