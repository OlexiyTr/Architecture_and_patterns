package task_3_1_fabric_2;

import java.util.List;

public class EquationClient {

    public void solve() {
        BiQuadraticEquation test = new BiQuadraticEquation(List.of(-16, 0, -12, 0, 0));
        EquationResult jopa = test.solve();
        if (jopa instanceof MoreThanOneEquationResult) {
            System.out.println(String.format(">> %s", ((MoreThanOneEquationResult) jopa).value));
        }
    }

}
