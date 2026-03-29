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
}
