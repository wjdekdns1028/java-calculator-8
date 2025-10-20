package calculator.domain;

public class Calculator {
    private Calculator() {}

    public static int calculate(String input) {
        InputString inputString = InputString.of(input); // 문자열 정규화 및 구분자 파싱
        Tokens tokens = inputString.toTokens(); // 구분자로 split()
        Numbers numbers = tokens.toNumbers(); // 숫자 리스트로 변환 및 검증
        return numbers.sum();
    }
}
