package EstorePackage;

public class AddressInfo {
    private String cityName;
    private String countryName;
    private String houseNumber;
    private String street;
    private String state;

    public  void  setAddressInfo(String cityName, String countryName, String houseNumber, String street, String state) {
        this.cityName = cityName;
        this.countryName = countryName;
        this.houseNumber = houseNumber;
        this.street = street;
        this.state = state;
    }
    public String getAddressInfo(){
        return cityName +" "+ " "+ countryName +" "+ " "+ houseNumber + " "+ " " + street +" "+ " "+ state;
    }

    public String toString(){
        return cityName +" "+ " "+ countryName +" "+ " "+ houseNumber + " "+ " " + street +" "+ " "+ state;
    }
}
