package Files;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class Json {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Car car = new Car();
        car.setColor("yellow");
        car.setMileage(200000L);
        car.setBrand("moto");
        car.setModel("honda");
        car.setModel("pencil");

        objectMapper.writeValue(System.out,car);

    }
}
