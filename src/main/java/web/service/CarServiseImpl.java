package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
@Component
public class CarServiseImpl implements CarService{
    private List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car("BMW", "E39"));
        carList.add(new Car("VW", "GOLF"));
        carList.add(new Car("TOYOTA", "LAND CRUISER"));
        carList.add(new Car("MERCEDES", "GLE"));
        carList.add(new Car("FORD", "SMAX"));
    }

    public List<Car> getCars(int carsCount) {
        if (carsCount >= 5) return carList;
        return carList.stream().limit(carsCount).toList();
    }
}
