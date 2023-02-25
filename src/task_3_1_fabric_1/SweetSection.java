package task_3_1_fabric_1;

public class SweetSection extends StoreSection {

    @Override
    public Drink createDrink(TypeOfDrink type) {
        switch (type) {
            case COCA_COLA: {
                return new CocaCola(5);
            }
            case FANTA: {
                return new Fanta(15);
            }
            case SPRITE: {
                return new Sprite(17);
            }
            default: {
                return new Water(10);
            }
        }
    }
}
