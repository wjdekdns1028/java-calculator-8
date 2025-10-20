//package calculator;
//
//public class StringCalculator {
//    public static int calculate(String input) {
//        if(input == null || input.isEmpty()) {
//            return 0;
//        }
//
//        input = input.replace("\\n", "\n");
//
//        String delimiter = "[,:]"; // 기본 구분자
//
//        if(input.startsWith("//")){
//            int delimiterIndex = input.indexOf("\n");
//            delimiter = input.substring(2, delimiterIndex);
//            input = input.substring(delimiterIndex + 1);
//        }
//
//        String[] tokens = input.split(delimiter);
//        int sum = 0;
//
//        for(String token : tokens){
//            validateNumber(token);
//            sum += Integer.parseInt(token);
//        }
//
//        return sum;
//    }
//
//    private static void validateNumber(String token){
//        if(!token.matches("-?\\d+")){
//            throw new IllegalArgumentException("숫자가 아닌 값이 포함되어 있습니다.");
//        }
//
//        int number = Integer.parseInt(token);
//        if(number < 0){
//            throw new IllegalArgumentException("음수는 입력할 수 없습니다: " + number);
//        }
//    }
//}
