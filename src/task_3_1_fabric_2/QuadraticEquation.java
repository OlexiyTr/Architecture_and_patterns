package task_3_1_fabric_2;

import java.util.List;

public class QuadraticEquation extends Equation {

    private List<Integer> odds;

    QuadraticEquation(List<Integer> odds) {
        super(odds);
        this.odds = odds;
    }

    @Override
    EquationResult solve() {

        Integer a = odds.get(0);
        Integer b = odds.get(1);
        Integer c = odds.get(2);

        TypeOfDiscriminant discriminant = calculateDiscriminant(a, b, c);

        if (discriminant instanceof DiscriminantLessThanZero) {
            return new NoneEquationResult();
        } else if (discriminant instanceof DiscriminantIsZero) {
            return new OneEquationResult(((DiscriminantIsZero) discriminant).getResult());
        } else if (discriminant instanceof DiscriminantGreaterThanZero) {
            return new MoreThanOneEquationResult(((DiscriminantGreaterThanZero) discriminant).getResult());
        }

        return null;
    }

    private TypeOfDiscriminant calculateDiscriminant(Integer a, Integer b, Integer c) {
        double discriminantValue = Math.pow(b, 2) - 4 * (a * c);
        if (discriminantValue > 0.0) {
            return new DiscriminantGreaterThanZero(b, a, discriminantValue);
        } else if (discriminantValue == 0.0) {
            return new DiscriminantIsZero(b, a);
        } else {
            return new DiscriminantLessThanZero();
        }
    }
}


