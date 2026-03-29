package racingcar.util;

import java.util.HashSet;

public class Utils {

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
