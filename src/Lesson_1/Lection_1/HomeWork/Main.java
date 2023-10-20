package Lesson_1.Lection_1.HomeWork;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BottleOfWatter b1 = new BottleOfWatter("1", 1, 1);
        BottleOfWatter b2 = new BottleOfWatter("2", 2, 2);
        BottleOfWatter b3 = new BottleOfWatter("5", 4, 3);
        BottleOfWatter b4 = new BottleOfWatter("15", 123, 1);
        BottleOfWatter b5 = new BottleOfWatter("20", 6, 5);
        HotDrink b6 = new HotDrink("34", 50, 90);
        HotDrink b7 = new HotDrink("56", 55, 92 );
        HotDrink b8 = new HotDrink("78", 45, 96);

        BottleOfWaterVendingMachine vendingMachine = new BottleOfWaterVendingMachine(new ArrayList<>());
        vendingMachine.addBottleOfWater(b1);
        vendingMachine.addBottleOfWater(b2);
        vendingMachine.addBottleOfWater(b3);
        vendingMachine.addBottleOfWater(b4);
        System.out.println(vendingMachine.getProduct("20", 5));
        System.out.println(vendingMachine.getProduct("20", 100));
//        for (BottleOfWatter b : vendingMachine.getBottleOfWatters()) {
//            System.out.println(b);
//        }

        HotDrinkMachine vendingHotMachine = new HotDrinkMachine(new ArrayList<>());
        vendingHotMachine.addHotDrink(b6);
        vendingHotMachine.addHotDrink(b7);
        vendingHotMachine.addHotDrink(b8);
        System.out.println(vendingHotMachine.getProduct("34", 90));
    }

}
