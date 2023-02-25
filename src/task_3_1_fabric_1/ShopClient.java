package task_3_1_fabric_1;

import java.util.ArrayList;
import java.util.List;

public class ShopClient {

    public void simulate() {
        CoffeeSection coffeeSection = new CoffeeSection();

        Drink americano = coffeeSection.createDrink(TypeOfDrink.AMERICANO);
        Drink latte = coffeeSection.createDrink(TypeOfDrink.LATTE);
        Drink espresso = coffeeSection.createDrink(TypeOfDrink.ESPRESSO);
        Drink cappuccino = coffeeSection.createDrink(TypeOfDrink.CAPPUCCINO);
        List<Drink> coffeeDrinks = new ArrayList<Drink>();
        coffeeDrinks.add(americano);
        coffeeDrinks.add(latte);
        coffeeDrinks.add(espresso);
        coffeeDrinks.add(cappuccino);

        Integer revenueFromCoffeeSection = getRevenueFromOneSection(coffeeSection, coffeeDrinks, 10);

        SweetSection sweetSection = new SweetSection();
        Drink fanta = sweetSection.createDrink(TypeOfDrink.FANTA);
        Drink sprite = sweetSection.createDrink(TypeOfDrink.SPRITE);
        Drink cocaCola = sweetSection.createDrink(TypeOfDrink.COCA_COLA);
        List<Drink> sweetDrinks = new ArrayList<Drink>();
        sweetDrinks.add(fanta);
        sweetDrinks.add(sprite);
        sweetDrinks.add(cocaCola);

        Integer revenueFromSweetSection = getRevenueFromOneSection(sweetSection, sweetDrinks, 5);

        Integer revenueFromDay = revenueFromSweetSection + revenueFromCoffeeSection;

        System.out.println(String.format(">> Revenue from day:%s", revenueFromDay));
    }

    private Integer getRevenueFromOneSection(StoreSection section, List<Drink> drinks, Integer margin) {

        for (Drink drink : drinks) {
            drink.calculateSelfCost(margin);
        }

        return section.calculateAllCost(drinks);

    }

}
