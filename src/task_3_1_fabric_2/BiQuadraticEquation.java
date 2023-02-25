package task_3_1_fabric_2;

import java.util.ArrayList;
import java.util.List;

public class BiQuadraticEquation extends Equation {

    private List<Integer> odds;

    BiQuadraticEquation(List<Integer> odds) {
        super(odds);
        this.odds = odds;
    }

    @Override
    EquationResult solve() {

        Integer a = odds.get(0);
        Integer b = odds.get(2);
        Integer c = odds.get(4);

        TypeOfDiscriminant discriminant = calculateDiscriminant(a, b, c);

        if (discriminant instanceof DiscriminantGreaterThanZero) {
            ArrayList<Double> resultOfGlobalVariable = ((DiscriminantGreaterThanZero) discriminant).getResult();

            ArrayList<Double> realXItems = new ArrayList<Double>();

            for (Double item : resultOfGlobalVariable) {
                realXItems.add(Math.sqrt(item));
                realXItems.add(-Math.sqrt(item));
            }

            return new MoreThanOneEquationResult(((DiscriminantGreaterThanZero) discriminant).getResult());

        } else if (discriminant instanceof DiscriminantIsZero) {

            Float result = ((DiscriminantIsZero) discriminant).getResult();

            ArrayList<Double> realXItems = new ArrayList<Double>();

            realXItems.add(Math.sqrt(result));
            realXItems.add(-Math.sqrt(result));

            return new MoreThanOneEquationResult(realXItems);
        } else {
            return new NoneEquationResult();
        }

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
