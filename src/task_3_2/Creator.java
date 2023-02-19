package task_3_2;

public abstract class Creator {
    public void someOperation() {
        Product p = createProduct();
        p.doSomething();
    }

    public abstract Product createProduct();

}


