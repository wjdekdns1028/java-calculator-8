package calculator.domain;

import java.util.ArrayList;
import java.util.List;

public class Tokens {
    private final String[] values; // 분리된 문자열 토큰들

    private Tokens(String[] values) {
        this.values = values;
    }

    public static Tokens of(String[] values) {
        return new Tokens(values);
    }

    public Numbers toNumbers() {
        List<Number> list = new ArrayList<>();
        for(String token : values) {
            if(token == null || token.isEmpty()) {
                continue;
            }
            list.add(Number.from(token));
        }
        return Numbers.of(list);
    }
}
