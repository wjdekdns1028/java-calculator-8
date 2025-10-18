package calculator;

public class StringCalculator {
    public static int calculate(String input) {
        if(input == null || input.isEmpty()) {
            return 0;
        }

        String[] tokens = input.split("[,:]");
        int sum = 0;

        for(String token : tokens){
            sum += Integer.parseInt(token);
        }

        return sum;
    }
}
