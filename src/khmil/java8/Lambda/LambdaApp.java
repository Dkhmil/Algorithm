package khmil.java8.Lambda;

public class LambdaApp {

    public static void main(String[] args) {
        Operationable op = (x, y) -> {
            if (x > 50) {
                x = x + 10;
                return x + y;
            } else {
                return x - y;
            }
        };

        Operationable op2 = (x, y) -> x / y;
        Operationable op3 = (x, y) -> x * y;
        Operationable op4 = (x, y) -> x % y;
        int result = op.calculate(40, 40);
        System.out.println(result);
    }


}

interface Operationable {
    int calculate(int x, int y);
}