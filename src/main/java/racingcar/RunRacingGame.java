package racingcar;


import java.util.ArrayList;
import java.util.List;
import racingcar.entity.Car;
import racingcar.entity.Cars;
import racingcar.view.racingCarInput;
import racingcar.view.racingCarOutput;

public class RunRacingGame {
    private racingCarInput input = new racingCarInput();
    private racingCarOutput output = new racingCarOutput();

    public void run() {
        String[] carNames = input.readCarNames();
        int tryCount = input.readTryCount();

        Cars cars = createCars(carNames);

        System.out.println("\n실행 결과");
        for (int i = 0; i < tryCount; i++) {
            cars.moveAllCars();
            output.printRaceResult(cars);
        }
        output.printWinner(cars.getWinners());
    }

    private Cars createCars(String[] carNames) {
        List<Car> carList = new ArrayList<>();
        for (String name : carNames) {
            carList.add(new Car(name));
        }
        return new Cars(carList);
    }
}
