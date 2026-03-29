package racingcar.entity;

import java.util.ArrayList;

public class Cars {
    private ArrayList<Car> cars;

    public Cars(ArrayList<Car> cars) {
        this.cars = cars;
    }

    public void moveAllCars() {
        for (Car car : this.cars) {
            car.setMoveCnt();
        }
    }
}
