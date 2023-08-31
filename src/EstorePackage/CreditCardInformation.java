package EstorePackage;

public class CreditCardInformation {
    private int cvv;
    private int year;
    private int month;
    private int cardNumber;
    private String nameOnCard;
    private String cardType;

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getNameOnCard() {
        return nameOnCard;
    }

    public void setNameOnCard(String nameOnCard) {
        this.nameOnCard = nameOnCard;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }
    public void setExpirationDetails(int year, int month){
        this.year = year;
        this.month = month;
    }
    public String getExpirationDetails(){
        return month + " " + year;
    }

}
