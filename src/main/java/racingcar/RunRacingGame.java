package racingcar;

import camp.nextstep.edu.missionutils.Console;
import racingcar.entity.Car;
import racingcar.entity.Cars;

import java.util.ArrayList;

import static racingcar.util.Utils.isValidNumber;
import static racingcar.util.Utils.splitNames;

public class RunRacingGame {
    public void run() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String[] carNames = splitNames(Console.readLine());
        System.out.println("시도할 회수는 몇회인가요?");
        int number = isValidNumber(Console.readLine());

        ArrayList<Car> carsList = new ArrayList<>();
        for (String carName : carNames) {
            Car car = new Car(carName);
            carsList.add(car);
        }

        System.out.println("\n실행 결과");
        Cars cars = new Cars(carsList);
        for (int i = 0; i < number; i++) {
            cars.moveAllCars();
            cars.printMoveResult();
        }
        cars.printWinner();
    }
}
