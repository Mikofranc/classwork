package Reflection2;

public enum Zones {
    SOUTH_SOUTH("Akwa-ibom", "Bayelsa", "Cross-river", "Delta", "Edo", "Rivers"),
    NORTH_EAST("Adamawa", "Bauchi", "Borno", "Gombe", "Taraba", "yobe"),
    NORTH_CENTRAL("Benue", "FCT", "Kogi", "Kwara", "Nasarawa", "Niger", "plateau"),
    SOUTH_EAST("Abia", "Anambra", "Ebonyi", "Enugu", "Imo"),
    SOUTH_WEST("Ekiti", "Lagos", "Osun", "Ondo", "Ogun", "Oyo"),
    NORTH_WEST("Kaduna", "Kastina", "Kano", "Kebbi", "Sokoto", "jigawa", "zamfara");

    private String[] states;

    public String[] getStates() {
        return states;
    }

    Zones(String... states){
        this.states = states;
    }
}
