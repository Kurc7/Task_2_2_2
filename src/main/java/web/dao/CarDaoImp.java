package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao {
    private static List<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car("Tesla", "Electro", 20000));
        cars.add(new Car("Lada", "L4", 6000));
        cars.add(new Car("Ferrari", "V8", 30000));
        cars.add(new Car("Toyota", "L6", 13000));
        cars.add(new Car("Паз", "V8", 15000));
    }

    @Override
    public List<Car> getCarList(int count) {
        return count < 5 ? cars.stream().limit(count).toList() : cars;
    }
}

