package task_3_1_fabric_1;

public class CoffeeSection extends StoreSection {

    @Override
    public Drink createDrink(TypeOfDrink type) {
        switch (type) {
            case AMERICANO: {
                return new Americano(100);
            }
            case CAPPUCCINO: {
                return new Cappuccino(50);
            }
            case ESPRESSO: {
                return new Espresso(20);
            }
            case LATTE: {
                return new Latte(750);
            }
            default: {
                return new Water(10);
            }
        }
    }
}
