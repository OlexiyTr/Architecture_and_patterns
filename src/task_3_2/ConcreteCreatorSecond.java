package task_3_2;

public class ConcreteCreatorSecond extends Creator {
    @Override
    public Product createProduct() {
        return new ProductSecond();
    }
}
