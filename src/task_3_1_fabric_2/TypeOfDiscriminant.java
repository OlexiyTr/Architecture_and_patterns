package task_3_1_fabric_2;

import java.util.ArrayList;

public interface TypeOfDiscriminant {
}

class DiscriminantLessThanZero implements TypeOfDiscriminant {
}

class DiscriminantIsZero implements TypeOfDiscriminant {
    private final Float x;

    DiscriminantIsZero(Integer b, Integer a) {
        x = (float) -(b / (2 * a));
    }

    Float getResult() {
        return x;
    }

}

class DiscriminantGreaterThanZero implements TypeOfDiscriminant {

    private final ArrayList<Double> x1_x2 = new ArrayList<Double>();

    DiscriminantGreaterThanZero(Integer b, Integer a, Double D) {
        Double x1 = ((-b) + (Math.sqrt(D))) / (2 * a);
        Double x2 = ((-b) - (Math.sqrt(D))) / (2 * a);
        x1_x2.add(x1);
        x1_x2.add(x2);
    }

    ArrayList<Double> getResult() {
        return x1_x2;
    }

}
