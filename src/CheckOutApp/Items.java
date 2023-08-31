package CheckOutApp;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Items {
    private List<Item> itemList = new ArrayList<>();
    private  int numerOfPieces;
    private int count;
    private double totalPrice;
    private final double vat = 0.075;
    private final double discount = 0.05;
    private int customerPayment;

    public int getCustomerPayment() {
        return customerPayment;
    }

    public void setCustomerPayment(int customerPayment) {
        if(customerPayment > 0 && customerPayment > Integer.valueOf(customerBill())){
            this.customerPayment = customerPayment;
        }else {
            System.out.println("please enter valid amount");
        }
    }

    public double getTotalPrice() {
        return totalPrice=subTotalprice();
    }
    public BigDecimal addVat(){
        BigDecimal vat = new BigDecimal(subTotalprice());
        vat.multiply(BigDecimal.valueOf(this.vat));
       return  vat;
    }
    public  BigDecimal discountedPrice(){
        BigDecimal discountPrice = new BigDecimal(subTotalprice());
        BigDecimal price =discountPrice.multiply(BigDecimal.valueOf(discount));
        return price;
    }
    public String customerBill(){
        BigDecimal bill = new BigDecimal(subTotalprice());
        BigDecimal calculatedBill = bill.add(addVat()).subtract(discountedPrice());
        return calculatedBill.toString();
    }
    public  BigDecimal customerBalance(){
        BigDecimal amount = new BigDecimal(getCustomerPayment());
        BigDecimal balance = amount.subtract(BigDecimal.valueOf(Integer.parseInt(customerBill())));
        return  balance;
    }

    private  double subTotalprice(){
        double total =0;
        for(Item item : itemList){
            total+=item.getTotal();
        }
        return total;
    }
    public void addItem(String name, int price, int noOfPieces) {
        Item item = new Item();
        item.setNameOfItem(name);
        item.setPriceOfItem(price);
        item.setQuantity(noOfPieces);
        item.setItemId(itemId());
        itemList.add(item);
    }
    public  int size(){
        return itemList.size();
    }
    public int itemId(){
        Item item = new Item();
        item.setItemId(++count);
        return  item.getItemId();
    }

    public Item findById(int id){
        for(Item item: itemList){
            if(item.getItemId()==id){
                System.out.println(item);
                return item;
            }
        }
        return null;
    }

    public String displayInfo(){
        System.out.print("""
                ==========================================
                                               ITEM         QTY         PRICE           TOTAL(NGN)
                --------------------------------------------------------------------------------------------------                               
                """);
        for(Item item: itemList){
            for(int index =1; index <= size(); index++){
                if(item.getItemId()==index){
                    return item.toString();
                }
            }
        }
        return null;    }

    public static void main(String[] args) {
        Items items = new Items();
        items.addItem("milo",200,5);
        items.addItem("m", 8, 9);

        System.out.println(items.displayInfo());
    }

    public String showAllItems() {
        for(int index = 1; index < size(); index++){
            findById(index);
        }
        return null;
    }
}
