package task_3_1_fabric_2;

import java.util.List;

public class QuadraticEquation extends Equation {

    private DiscriminantSolver discriminantSolver = new DiscriminantSolver();
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

        TypeOfDiscriminant discriminant = discriminantSolver.calculateDiscriminant(a, b, c);

        if (discriminant instanceof DiscriminantGreaterThanZero) {
            return new MoreThanOneEquationResult(((DiscriminantGreaterThanZero) discriminant).getResult());
        } else if (discriminant instanceof DiscriminantIsZero) {
            return new OneEquationResult(((DiscriminantIsZero) discriminant).getResult());
        } else {
            return new NoneEquationResult();
        }
    }


}


