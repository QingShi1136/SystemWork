package Ex84;

public class Factory1 implements  AbstractFactory{
    public ProductA createProductA() {
        /**********Begin**********/
       /* System.out.println("Factory1: Creating a ProductA1 object.");*/
        /**********End**********/
        return new ProductA1();
    }

    public ProductB createProductB() {
        /**********Begin**********/
       /* System.out.println("Factory1: Creating a ProductB1 object.");*/
        /**********End**********/
        return new ProductB1();
    }
}
