package racingcar.entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Cars {
    private List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public void moveAllCars() {
        for (Car car : this.cars) {
            car.setMoveCnt();
        }
    }

    public void printMoveResult() {
        for (Car car : this.cars) {
            System.out.println(car.getName() + " : " + "-".repeat(car.getMoveCnt()));
        }
        System.out.println();
    }

    private int findMaxMoveCnt() {
        int max = 0;
        for (Car car : this.cars) {
            if (car.getMoveCnt() > max) {
                max = car.getMoveCnt();
            }
        }
        return max;
    }

    private ArrayList<String> findWinners(int max) {
        ArrayList<String> winners = new ArrayList<>();
        for (Car car : this.cars) {
            if (car.getMoveCnt() == max) {
                winners.add(car.getName());
            }
        }
        return winners;
    }

    public void printWinner() {
        ArrayList<String> winners = findWinners(findMaxMoveCnt());
        System.out.println("최종 우승자 : " + String.join(", ", winners));
    }

    private void validateDuplicate(List<Car> cars) {
        HashSet<String> set = new HashSet<>();
        for (Car car : cars) {
            if (!set.add(car.getName())) {
                throw new IllegalArgumentException("이름 중복은 허용 안됩니다.");
            }
        }
    }
}
