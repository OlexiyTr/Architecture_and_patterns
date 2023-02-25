package task_3_1_fabric_1;

public class CocaCola implements Drink {
    private Integer cost;

    CocaCola(Integer cost) {
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

