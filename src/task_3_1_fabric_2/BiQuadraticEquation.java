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
            ArrayList<Float> resultOfGlobalVariable = ((DiscriminantGreaterThanZero) discriminant).getResult();

            System.out.println(resultOfGlobalVariable);

            ArrayList<Float> realXItems = new ArrayList<Float>();

            for (Float item : resultOfGlobalVariable) {

                if (item == 0.0) {
                    realXItems.add((float) Math.sqrt(item));
                } else {
                    realXItems.add((float) Math.sqrt(item));
                    realXItems.add((float) -Math.sqrt(item));
                }
            }

            return new MoreThanOneEquationResult(realXItems);

        } else if (discriminant instanceof DiscriminantIsZero) {

            Float result = ((DiscriminantIsZero) discriminant).getResult();

            ArrayList<Float> realXItems = new ArrayList<Float>();

            realXItems.add((float) Math.sqrt(result));
            realXItems.add((float) -Math.sqrt(result));

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
