package khmil.java8.Lambda;

public class LambdaAppAnonim {
    public static void main(String[] args) {
        Operation operation = new Operation() {
            @Override
            public double calculate(int x, int y) {
                return x/y;
            }
        };
        double result = operation.calculate(100,31);
        System.out.println(result);
    }

}

interface Operation {
    double calculate(int x, int y);
}