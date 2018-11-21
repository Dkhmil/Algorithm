package khmil.java8.Lambda;

interface DoSmth {
    int execute(int x, int y);
}

public class LambdaAsReult {

    public static void main(String[] args) {
        int c = action(1).execute(6,7);
        System.out.println(c);
    }

    private static DoSmth action(int number) {
        switch (number) {
            case 1:
                return ((x, y) -> x + y);
            case 2:
                return ((x, y) -> x - y);
            case 3:
                return ((x, y) -> x * y);
            default:
                return ((x, y) -> x / y);
        }
    }
}
