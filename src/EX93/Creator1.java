package EX93;

public class Creator1 extends Creator{
    private Product product;
    @Override
    public String operation() {
        return "Hello World from "
                + this.getClass().getSimpleName() + "!\n"
                + product.getName() + " created.";
    }
    /*********Begin********/


    /*********End**********/
}
