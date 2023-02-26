package task_3_1_fabric_2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EquationClient {

    public void solve() {
        solver("/Users/oleksii.troshchyi/IdeaProjects/Architecture_and_patterns/src/task_3_1_fabric_2/input0.txt");
        solver("/Users/oleksii.troshchyi/IdeaProjects/Architecture_and_patterns/src/task_3_1_fabric_2/input1.txt");
        solver("/Users/oleksii.troshchyi/IdeaProjects/Architecture_and_patterns/src/task_3_1_fabric_2/input2.txt");
    }

    private void solver(String nameOfFile) {
        ArrayList<ArrayList<Integer>> input = fileReader(nameOfFile);
        ArrayList<EquationResult> resultsOfEquations = new ArrayList<>();

        for (ArrayList<Integer> item : input) {
            if (item.size() == 2) {
                Equation linearEquation = new Equation(item);
                resultsOfEquations.add(linearEquation.solve());
            } else if (item.size() == 3) {
                QuadraticEquation quadraticEquation = new QuadraticEquation(item);
                resultsOfEquations.add(quadraticEquation.solve());
            } else {
                BiQuadraticEquation biQuadraticEquation = new BiQuadraticEquation(item);
                resultsOfEquations.add(biQuadraticEquation.solve());
            }
        }

        showDifferentTypesOfEquation(resultsOfEquations, input);
    }

    private void showDifferentTypesOfEquation(ArrayList<EquationResult> resultsOfEquations, ArrayList<ArrayList<Integer>> itemsOfOdds) {
        for (EquationResult result : resultsOfEquations) {
            if (result instanceof NoneEquationResult) {
                ArrayList<Integer> value = itemsOfOdds.get(resultsOfEquations.indexOf(result));
                System.out.println(String.format(">> This equation has no solutions: %s", value));
            } else if (result instanceof OneEquationResult) {
                ArrayList<Integer> value = itemsOfOdds.get(resultsOfEquations.indexOf(result));
                System.out.println(String.format(">> This equation has one solution: %s", value));
            } else {
                if (result instanceof MoreThanOneEquationResult) {
                    MoreThanOneEquationResult moreThanOneEquationResult = (MoreThanOneEquationResult) result;
                    if (moreThanOneEquationResult.value.size() == 2) {
                        ArrayList<Integer> value = itemsOfOdds.get(resultsOfEquations.indexOf(result));
                        System.out.println(String.format(">> This equation has 2 solutions: %s", value));
                    } else if (moreThanOneEquationResult.value.size() == 3) {
                        ArrayList<Integer> value = itemsOfOdds.get(resultsOfEquations.indexOf(result));
                        System.out.println(String.format(">> This equation has 3 solutions: %s", value));
                    } else if (moreThanOneEquationResult.value.size() == 4) {
                        ArrayList<Integer> value = itemsOfOdds.get(resultsOfEquations.indexOf(result));
                        System.out.println(String.format(">> This equation has 4 solutions: %s", value));
                    } else {
                        ArrayList<Integer> value = itemsOfOdds.get(resultsOfEquations.indexOf(result));
                        System.out.println(String.format(">> The equation has an infinite number of solutions: %s", value));
                    }
                }
            }
        }
    }

    private ArrayList<ArrayList<Integer>> fileReader(String nameOfFile) {
        ArrayList<ArrayList<Integer>> resultItemsForValidation = new ArrayList<>();
        try {
            File file = new File(nameOfFile);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                line = line.replaceAll("[^-?0-9]+", " ");
                List<String> lineList = List.of(line.split(" "));
                resultItemsForValidation.add(createOddsList(lineList));
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return resultItemsForValidation;
    }

    private ArrayList<Integer> createOddsList(List<String> strings) {
        int size = strings.size();
        ArrayList<Integer> resultList = new ArrayList<>();
        for (int i = 1; i < size; i++) {
            resultList.add(Integer.valueOf(strings.get(i)));
        }
        return resultList;
    }

}
