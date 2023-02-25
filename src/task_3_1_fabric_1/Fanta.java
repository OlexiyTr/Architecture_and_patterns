package task_3_1_fabric_1;

public class Fanta implements Drink {
    private Integer cost;

    Fanta(Integer cost) {
        this.cost = cost;
    }

    @Override
    public void calculateSelfCost(Integer margin) {
        this.cost += margin;
    }

    @Override
    public Integer getAllCost() {
        return this.cost;
    }
}
