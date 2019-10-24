package pl.przybyla.operation;

import org.springframework.stereotype.Component;

@Component
public class AdditionOperation implements Operation {

    public double calculate(double arg1, double arg2) {
        return arg1 + arg2;
    }

    public OperationType getSupportedOperationType() {
        return OperationType.ADDITION;
    }
}
