import task_3_1.*;
import task_3_2.ConcreteCreatorFirst;
import task_3_2.ConcreteCreatorSecond;
import task_3_2.Product;

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
        ConcreteCreatorFirst c1 = new ConcreteCreatorFirst();
        ConcreteCreatorSecond c2 = new ConcreteCreatorSecond();

        Product p1 = c1.createProduct();
        Product p2 = c2.createProduct();

        p1.doSomething();
        p2.doSomething();
    }

    private static void taskMarker(String nameOfTask) {
        System.out.println(String.format(">> %s", nameOfTask));
    }
}