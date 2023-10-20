package Lesson_1.Lection_1.HomeWork;

import java.util.List;

public class HotDrinkMachine implements VendingMachine {

    List<HotDrink> hotDrinks;

    public HotDrinkMachine(List<HotDrink> products) {
        this.hotDrinks = products;
    }

    public List<HotDrink> getProducts() {
        return hotDrinks;
    }

    public void setHotDrinks(List<HotDrink> products) {
        this.hotDrinks = products;
    }

    @Override
    public Product getProduct(String name) {
        for (HotDrink item : hotDrinks) {
            if (item.getName().equals(name))
                return item;
        }
        return null;
    }

        public Product getProduct(String name, int temperature){
            for (HotDrink hot : hotDrinks) {
                if (hot.getName().equals(name) && hot.getTemperature() == temperature)
                    return hot;
            }
            return null;
        }
        public void addHotDrink (HotDrink hotDrink){
        this.hotDrinks.add(hotDrink);
        }
    }
