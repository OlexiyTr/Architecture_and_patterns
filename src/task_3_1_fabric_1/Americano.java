package task_3_1_fabric_1;

public class Americano implements Drink {
    private Integer selfCost;
    Americano(Integer selfCost) {
        this.selfCost = selfCost;
    }

    @Override
    public void calculateSelfCost(Integer margin) {
        selfCost += margin;
    }

    @Override
    public Integer getAllCost() {
        return this.selfCost;
    }
}

