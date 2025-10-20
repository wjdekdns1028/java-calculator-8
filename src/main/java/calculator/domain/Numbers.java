package calculator.domain;

import java.util.List;

public class Numbers {
    private final List<Number> values;

    private Numbers(List<Number> values) {
        this.values = values;
    }

    public static Numbers of(List<Number> values) {
        return new Numbers(values);
    }

    public int sum(){
        return values.stream()
                .mapToInt(Number::value)
                .sum();
    }
}
