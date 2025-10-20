package calculator.domain;

public class Number {
    private final int value;

    private Number(int value) {
        this.value = value;
    }

    public static Number from(String token){
        if(!token.matches("\\d+")){
            throw new IllegalArgumentException("숫자가 아닌 값이 포함되어 있습니다.");
        }

        int n = Integer.parseInt(token);

        if(n < 0){
            throw new IllegalArgumentException("음수는 입력할 수 없습니다: " + n);
        }
        return new Number(n);
    }

    public int value(){
        return value;
    }
}
