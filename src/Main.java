import task_3_1.*;

public class Main {
    public static void main(String[] args) {

        taskMarker("task_3_1");
        CarBuilder carBuilder = new CarBuilder("BMW-builder");
        carBuilder.setEngine(new Engine("V8"));
        carBuilder.setWheel(new Wheel("summer"));
        Car car = carBuilder.build();

        CarSimulator carSimulator = new CarSimulator(carBuilder, car);
        carSimulator.showProcess();

        taskMarker("task_3_2");

    }

    private static void taskMarker(String nameOfTask) {
        System.out.println(String.format(">> %s", nameOfTask));
    }
}