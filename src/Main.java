import task_2_2_city_transport_park.ClientForCityAutoPark;
import task_3_1.*;
import task_3_1_fabric_1.ShopClient;
import task_3_1_text_editor_autofactory_director.AutofactoryClient;
import task_3_2.ConcreteCreator1;
import task_3_2.ConcreteCreator2;
import task_3_2.Product;
import task_4_3_2_string_builder.MyStringBuilderClient;

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
        ConcreteCreator1 c1 = new ConcreteCreator1();
        ConcreteCreator2 c2 = new ConcreteCreator2();

        Product p1 = c1.createProduct();
        Product p2 = c2.createProduct();
        p1.doSomething();
        p2.doSomething();

        taskMarker("task_3_1_fabric_1");

        ShopClient shopClient = new ShopClient();
        shopClient.simulate();

        taskMarker("task_2_2");
        //ClientForCityAutoPark client = new ClientForCityAutoPark();
        //client.show();

        taskMarker("task_3_1_autofactory");
        new AutofactoryClient();
        taskMarker("task_4_3_2_string_builder");
        new MyStringBuilderClient();
    }

    private static void taskMarker(String nameOfTask) {
        System.out.println(String.format(">> %s", nameOfTask));
    }
}