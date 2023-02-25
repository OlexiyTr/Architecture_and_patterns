package task_3_1_fabric_2;

import java.util.List;

public class MoreThanOneEquationResult implements EquationResult {
    List<Float> value;

    MoreThanOneEquationResult(List<Float> value) {
        this.value = value;
    }
}
