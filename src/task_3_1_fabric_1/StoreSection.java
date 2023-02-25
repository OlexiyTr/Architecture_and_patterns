package task_3_1_fabric_1;

import java.util.List;

public abstract class StoreSection {

    public Integer calculateAllCost(List<Drink> items) {
        Integer result = 0;

        for (Drink item : items) {
            result += item.getAllCost();
        }

        return result;
    }
    public abstract Drink createDrink(TypeOfDrink type);

}

