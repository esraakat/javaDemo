public class ProductManager {
    public void add(Product product) {
        //ProductValidator validator = new ProductValidator();
        if (ProductValidator.isValid(product)) {
            System.out.println("The product was added!");
        } else {
            System.out.println("The product is not valid");
        }
    }
    public void Do(){

    }
}
