package Files.JsonUrl;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Address {
    private String street;
    private String suite;
    private String city;
    private String zipcode;
    @JsonProperty("geo")
    private  GeographicalLocation geographicalLocation;
}
