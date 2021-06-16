package Ex84;

public class Client {
    private ProductA productA;
    private ProductB productB;
    private AbstractFactory factory;

    public Client(AbstractFactory factory) {
        /**********Begin**********/
        AbstractFactory factory1 = new Factory1();
        ProductA productA = factory.createProductA();
        ProductB productB = factory.createProductB();
        /**********End**********/
    }

    public String operation() {
        System.out.println("Client  : Delegating creating objects to a factory object.");
        /**********Begin**********/

        /**********End**********/
        // Doing something appropriate on the created objects.
        return "Hello World from " + productA.getName() + " and "
                + productB.getName() + "!";
    }

}
