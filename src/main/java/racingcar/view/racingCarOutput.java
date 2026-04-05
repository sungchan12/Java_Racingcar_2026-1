package racingcar.view;

import java.util.List;
import racingcar.domain.Car;
import racingcar.domain.Cars;

public class racingCarOutput {

    public void printRaceResult(Cars cars) {
        for (Car car : cars.getCars()) {
            System.out.println(car.getName() + " : " + "-".repeat(car.getMoveCnt()));
        }
        System.out.println();
    }

    public void printWinner(List<String> winners) {
        System.out.println("최종 우승자 : " + String.join(", ", winners));
    }
}