package Lesson_2.HomeWork;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human human1 = new Human("Petr");
        Human human2 = new Human("Andrey");
        market.acceptToMarket(human1);
        market.acceptToMarket(human2);
        market.update();
    }
}
