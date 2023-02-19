package task_3_1;

public class CarSimulator {
    public CarBuilder carBuilder;

    public Car car;

    public CarSimulator(CarBuilder carBuilder, Car car) {
        this.carBuilder = carBuilder;
        this.car = car;
    }

    public void showProcess() {
        String result = String.format("%s build a car with %s wheel and %s engine:)", this.carBuilder.name, this.car.wheel.name, this.car.engine.name);
        System.out.println(result);
    }

}

