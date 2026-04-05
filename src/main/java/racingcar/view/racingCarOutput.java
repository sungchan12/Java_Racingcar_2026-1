package racingcar.view;

import racingcar.domain.Car;
import racingcar.domain.Cars;

public class racingCarOutput {

    public void printRaceResult(Cars cars) {
        for (Car car : cars.getCars()) {
            System.out.println(car.getName() + " : " + "-".repeat(car.getMoveCnt()));
        }
        System.out.println();
    }
}