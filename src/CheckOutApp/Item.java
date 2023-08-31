package CheckOutApp;

public class Item {
    private String nameOfItem;
    private int priceOfItem;
    private  int amount;
    private int itemId;
    private  int quantity;
    private double total;

    public Item(String nameOfItem, int priceOfItem, int quantity) {
        this.nameOfItem = nameOfItem;
        this.priceOfItem = priceOfItem;
        this.quantity = quantity;
    }
    public  Item(){}

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotal() {
        return total = getQuantity() * getPriceOfItem();
    }


    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getNameOfItem() {
        return nameOfItem;
    }

    public void setNameOfItem(String nameOfItem) {
        this.nameOfItem = nameOfItem;
    }

    public int getPriceOfItem() {
        return priceOfItem;
    }

    public void setPriceOfItem(int priceOfItem) {
        this.priceOfItem = priceOfItem;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "                               "+getNameOfItem()+"            " +getQuantity() +"           "+ getPriceOfItem() +"                 "+ getTotal();

    }

}
