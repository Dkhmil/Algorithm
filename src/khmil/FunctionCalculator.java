package khmil;

import java.util.function.DoubleUnaryOperator;

public class FunctionCalculator implements DoubleUnaryOperator {
    @Override
    public double applyAsDouble(double operand) {
        return 0;
    }
    public static double integrate(DoubleUnaryOperator f, double a, double b) {
        //method of integration by using formula Cotes's
        double s = 0;
        double h = 0.0000001;
        for(double i = a; i < b; i += 0.0000001) {
            s += h*(f.applyAsDouble(a));
        }
        return s;

    }
    public static void main(String[] args) {
        System.out.println(integrate(x -> 1, 0, 10));//10.0
        System.out.println(integrate(x -> x + 2, 0, 10));
        System.out.println(integrate( x -> Math.sin(x) / x , 1, 5));
    }
}
