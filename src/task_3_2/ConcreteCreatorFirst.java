package task_3_2;

public class ConcreteCreatorFirst extends Creator {

    @Override
    public Product createProduct() {
        return new ProductFirst();
    }
}
