package EnumClassChibuor;

public enum School {
    NOUN("national open university"),
    UNILAG("university of lagos"),
    UNN("university of Nigeria Nusuka");

    private String fullName;

    School( String fullName){
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }
}
