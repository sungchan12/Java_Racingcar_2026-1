package racingcar.entity;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.util.Utils;

public class Car {
    private final String name;
    private int moveCnt;

    public Car(String name) {
        Utils.isValidName(this.name = name);
        this.moveCnt = 0;
    }

    public String getName() {
        return this.name;
    }

    public int getMoveCnt() {
        return this.moveCnt;
    }

    public void setMoveCnt() {
        int RandomNum = Randoms.pickNumberInRange(0, 9);
        if (RandomNum >= 4) {
            this.moveCnt += 1;
        }
    }
}
