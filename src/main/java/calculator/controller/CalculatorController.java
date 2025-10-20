package calculator.controller;

import calculator.domain.Calculator;
import calculator.view.InputView;
import calculator.view.OutputView;

public class CalculatorController {

    public void run(){
        String input = InputView.read(); // 입력
        int result = Calculator.calculate(input); // 계산
        OutputView.printResult(result); // 출력
    }
}
