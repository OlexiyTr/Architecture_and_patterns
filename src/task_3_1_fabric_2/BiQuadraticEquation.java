package task_3_1_fabric_2;

import java.util.ArrayList;
import java.util.List;

public class BiQuadraticEquation extends Equation {

    private DiscriminantSolver discriminantSolver = new DiscriminantSolver();
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

        TypeOfDiscriminant discriminant = discriminantSolver.calculateDiscriminant(a, b, c);
        return checkDiscriminant(discriminant);
    }

    private EquationResult checkDiscriminant(TypeOfDiscriminant discriminant) {
        if (discriminant instanceof DiscriminantGreaterThanZero) {

            ArrayList<Float> resultOfGlobalVariable = ((DiscriminantGreaterThanZero) discriminant).getResult();

            ArrayList<Float> realXItems = new ArrayList<>();

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

            ArrayList<Float> realXItems = new ArrayList<>();

            realXItems.add((float) Math.sqrt(result));

            realXItems.add((float) -Math.sqrt(result));

            return new MoreThanOneEquationResult(realXItems);
        } else {
            return new NoneEquationResult();
        }
    }
}
