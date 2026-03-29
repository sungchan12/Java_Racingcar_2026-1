package racingcar.util;

import java.util.HashSet;

public class Utils {

    public static void isValidName(String name) {
        if (name.isBlank() || name.contains(" ")) {
            throw new IllegalArgumentException("이름 공백 또는 빈값은 안됩니다.");
        }
        if (name.length() > 5) {
            throw new IllegalArgumentException("5글자 초과했습니다.");
        }
    }

    public static int isValidNumber(String input) {
        try {
            int number = Integer.parseInt(input);
            if (number < 1) {
                throw new IllegalArgumentException("1 미만의 숫자는 입력할 수 없습니다.");
            }
            return number;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("숫자를 입력해야 합니다.");
        }
    }

    public static String[] splitNames(String input) {
        String[] names = input.split(",");
        HashSet<String> set = new HashSet<>();
        for (String name : names) {
            if (!set.add(name)) {
                throw new IllegalArgumentException("이름 중복은 허용 안됩니다.");
            }
        }
        return names;
    }
}
