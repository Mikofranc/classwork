package Files.JsonUrl;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class GeographicalLocation {
    @JsonProperty("lat")
    private String latitude;
    @JsonProperty("lng")
    private String longtitude;
}
