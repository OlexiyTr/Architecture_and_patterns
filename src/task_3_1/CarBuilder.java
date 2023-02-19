package task_3_1;

public class CarBuilder {

    String name;
    Car car = new Car(new Wheel("default"), new Engine("default"));

    public CarBuilder(String name) {
        this.name = name;
    }

    public Car build() {
        return this.car;
    }

    public void setWheel(Wheel wheel) {
        this.car.wheel = wheel;
    }

    public void setEngine(Engine engine) {
        this.car.engine = engine;
    }

}
