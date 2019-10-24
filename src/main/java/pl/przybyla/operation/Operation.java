package pl.przybyla.operation;

public interface Operation {

    double calculate(double arg1, double arg2);
    OperationType getSupportedOperationType();
}
