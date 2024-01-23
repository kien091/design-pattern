package org.example;

import org.example.Factory.LevelAbstractFactory;
import org.example.Factory.LevelFactory;
import org.example.Medal.Medal;
import org.example.Prize.Prize;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ClientTest {
    public static void main(String[] args) {
        LevelAbstractFactory top1Factory = LevelFactory.getLevelFactory(Segment.TOP1);
        Medal goldMedal = top1Factory.getMedal();
        Prize firstPrize = top1Factory.getPrize();

        System.out.println(goldMedal.getName());
        System.out.println(firstPrize.getName());
        System.out.println("=====================================");

        LevelAbstractFactory top2Factory = LevelFactory.getLevelFactory(Segment.TOP2);
        Medal silverMedal = top2Factory.getMedal();
        Prize secondPrize = top2Factory.getPrize();

        System.out.println(silverMedal.getName());
        System.out.println(secondPrize.getName());
        System.out.println("=====================================");

        LevelAbstractFactory top3Factory = LevelFactory.getLevelFactory(Segment.TOP3);
        Medal bronzeMedal = top3Factory.getMedal();
        Prize thirdPrize = top3Factory.getPrize();

        System.out.println(bronzeMedal.getName());
        System.out.println(thirdPrize.getName());
    }
}