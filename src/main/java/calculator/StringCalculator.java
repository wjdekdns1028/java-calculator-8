package calculator;

public class StringCalculator {
    public static int calculate(String input) {
        if(input == null || input.isEmpty()) {
            return 0;
        }

        String delimiter = "[,:]"; // 기본 구분자

        if(input.startsWith("//")){
            int delimiterIndex = input.indexOf("\n");
            delimiter = input.substring(2, delimiterIndex);
            input = input.substring(delimiterIndex + 1);
        }

        String[] tokens = input.split(delimiter);
        int sum = 0;

        for(String token : tokens){
            sum += Integer.parseInt(token);
        }

        return sum;
    }
}
