package task_3_2;

public class ConcreteCreator1 extends Creator {

    @Override
    public Product createProduct() {
        return new Product1();
    }
}
