package EstorePackage;

public class User extends Estore{
    private Customer customer;
    private Admin admin;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
