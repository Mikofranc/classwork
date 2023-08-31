package EstorePackage;

public class BillingInformation {
    private int reciversPhoneNumber;
    private  String recieverName;
    private String deliveryAddress;
    private CreditCardInformation creditCardInformation;

    public int getReciversPhoneNumber() {
        return reciversPhoneNumber;
    }

    public void setReciversPhoneNumber(int reciversPhoneNumber) {
        this.reciversPhoneNumber = reciversPhoneNumber;
    }

    public String getRecieverName() {
        return recieverName;
    }

    public void setRecieverName(String recieverName) {
        this.recieverName = recieverName;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public CreditCardInformation getCreditCardInformation() {
        return creditCardInformation;
    }

    public void setCreditCardInformation(CreditCardInformation creditCardInformation) {
        this.creditCardInformation = creditCardInformation;
    }
}
