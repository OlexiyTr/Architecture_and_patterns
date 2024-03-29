
import task_3_1.*;
import task_3_1_fabric_1.ShopClient;
import task_3_1_text_editor_autofactory_director.AutofactoryClient;
import task_3_2.ConcreteCreator1;
import task_3_2.ConcreteCreator2;
import task_3_2.Product;
import task_4_3_2_string_builder.MyStringBuilderClient;
import task_7_3_1_usb_charger.TypeCClient;
import task_7_3_2_auto_calculator.CustomsClient;
import task_8_3_1_cafe_bridge.CafeClient;
import task_8_3_2_bridge_refactoring.task_3_2.Canvas;

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

//        taskMarker("task_2_2");
//        //ClientForCityAutoPark client = new ClientForCityAutoPark();
//        //client.show();

        taskMarker("task_3_1_autofactory");
        new AutofactoryClient();
        taskMarker("task_4_3_2_string_builder");
        new MyStringBuilderClient();

        taskMarker("task_7_3_1_usb_charger");
        new TypeCClient();

        taskMarker("task_7_3_2_auto_calculator");
        new CustomsClient();
        taskMarker("task_8_3_1_cafe_bridge");
        new CafeClient();
        taskMarker("task_8_3_2_refactor_brdige");
        new Canvas();
    }

    private static void taskMarker(String nameOfTask) {
        System.out.println(String.format(">> %s", nameOfTask));
    }
}