package task_3_1_fabric_2;

public class DiscriminantIsZero implements TypeOfDiscriminant {
    private final Float x;

    DiscriminantIsZero(Integer b, Integer a) {
        x = (float) -(b / (2 * a));
    }

    Float getResult() {
        return x;
    }

}
