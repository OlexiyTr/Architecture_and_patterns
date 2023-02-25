package task_3_1_fabric_2;

import java.util.ArrayList;

public class DiscriminantGreaterThanZero implements TypeOfDiscriminant {

    private final ArrayList<Float> x1_x2 = new ArrayList<Float>();

    DiscriminantGreaterThanZero(Integer b, Integer a, Double D) {
        Float x1 = ((float) ((-b) + (Math.sqrt(D))) / (2 * a));
        Float x2 = ((float) ((-b) - (Math.sqrt(D))) / (2 * a));
        x1_x2.add(x1);
        x1_x2.add(x2);
    }

    ArrayList<Float> getResult() {
        return x1_x2;
    }

}
