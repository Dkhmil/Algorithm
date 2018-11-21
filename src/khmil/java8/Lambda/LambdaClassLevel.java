package khmil.java8.Lambda;

public class LambdaClassLevel {
    static int x = 30;
    static int y = 20;

    public static void main(String[] args) {
        Calculationable calculationable = new Calculationable() {
            @Override
            public int calculate() {
                x = 50;
                return x + y;
            }
        };
        System.out.println(calculationable.calculate());
        System.out.println(x);
    }

}

interface Calculationable {
    int calculate();
}
