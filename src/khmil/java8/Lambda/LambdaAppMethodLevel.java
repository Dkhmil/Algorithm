package khmil.java8.Lambda;

public class LambdaAppMethodLevel {
    public static void main(String[] args) {
        int m = 100;
        int n = 200;
        Result result = new Result() {
            @Override
            public int result() {
                return m + n ;
            }
        };
        System.out.println(result.result());
    }
}
interface Result{
    int result();
}
