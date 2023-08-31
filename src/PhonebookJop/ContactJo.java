package PhonebookJop;

public class ContactJo {
    private  String name;
    private String phoneNUmber;

    public ContactJo(String name, String phoneNUmber) {
        this.name = name;
        this.phoneNUmber = phoneNUmber;
    }
    public ContactJo() {

    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNUmber() {
        return phoneNUmber;
    }

    public void setPhoneNUmber(String phoneNUmber) {
        this.phoneNUmber = phoneNUmber;
    }

    @Override
    public String toString() {
        return "name: "+name + "  "+"Phone number: "+ phoneNUmber;
    }
}
