package task_3_1_fabric_2;

import java.util.List;

public class MoreThanOneEquationResult implements EquationResult {
    List<Double> value;

    MoreThanOneEquationResult(List<Double> value) {
        this.value = value;
    }
}
