package khmil;

import java.util.function.IntSupplier;
import java.util.stream.IntStream;

class Stream {

    public static IntStream pseudoRandomStream(int seed) {
        IntSupplier generator = new IntSupplier() {
            int current = 0;
            int mid(int index) {
                if (index == 0) {
                    return seed;
                }
                int m = mid(index - 1);
                m *= m;

                int result = 0;
                int counter = 0;
                int r;
                while (m > 0) {
                    r = m % 10;
                    counter++;
                    if (counter >= 2 && counter <= 4) result += r * Math.pow(10, counter - 2);
                    m /= 10;
                }

                return result;
            }

            public int getAsInt() {
                return mid(current++);
            }
        };

        IntStream sorted = IntStream.generate(generator);

        return sorted;
    }

    public static void main(String[] args) {

        IntStream i = pseudoRandomStream(13);
        i.limit(10).forEach(System.out::println);
    }
}
