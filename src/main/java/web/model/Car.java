package web.model;

import lombok.Data;

@Data
public class Car {
    private String model;
    private String engine;
    private int price;

    public Car() {
    }

    public Car(String model, String engine, int price) {
        this.model = model;
        this.engine = engine;
        this.price = price;
    }
}
