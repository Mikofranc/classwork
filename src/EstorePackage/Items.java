package EstorePackage;

public class Items {
    private int quantityOfProduct;

    public int getQuantityOfProduct() {
        return quantityOfProduct;
    }

    public void setQuantityOfProduct(int quantityOfProduct) {
        this.quantityOfProduct = quantityOfProduct;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    private  Product product;
}
