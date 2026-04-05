package racingcar.entity;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    private final String name;
    private int moveCnt;
    private final int MOVE_THRESHOLD = 4;

    public Car(String name) {
        validateName(this.name = name);
        this.moveCnt = 0;
    }

    public String getName() {
        return this.name;
    }

    public int getMoveCnt() {
        return this.moveCnt;
    }

    public void setMoveCnt() {
        if (Randoms.pickNumberInRange(0, 9) >= MOVE_THRESHOLD) {
            this.moveCnt++;
        }
    }

    private void validateName(String name) {
        if (name.isBlank() || name.contains(" ")) {
            throw new IllegalArgumentException("이름 공백 또는 빈값은 안됩니다.");
        }
        if (name.length() > 5) {
            throw new IllegalArgumentException("5글자 초과했습니다.");
        }
    }
}
