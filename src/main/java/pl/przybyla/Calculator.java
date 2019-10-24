package pl.przybyla;


import org.springframework.stereotype.Component;
import pl.przybyla.operation.OperationType;
import pl.przybyla.operation.Operation;

import java.util.List;

@Component
public class Calculator {

    private final List<Operation> operations;

    public Calculator(List<Operation> operations) {
        this.operations = operations;
    }

    double calculate(OperationType operationType, double arg1, double arg2){
        Operation operation= getOperationForOperationType(operationType);
        return operation.calculate(arg1, arg2);
    }
    private Operation getOperationForOperationType(OperationType operationType){
        return operations.stream()
                .filter(operation -> operation.getSupportedOperationType().equals(operationType))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Not supported operation type"));
    }
}
