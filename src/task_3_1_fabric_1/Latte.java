package task_3_1_fabric_1;

public class Latte implements Drink {
    private Integer selfCost;

    Latte(Integer selfCost) {
        this.selfCost = selfCost;
    }

    @Override
    public void calculateSelfCost(Integer margin) {
        selfCost += margin;
    }

    @Override
    public Integer getAllCost() {
        return selfCost;
    }
}


