package khmil;

public class AsciiCharSequence implements CharSequence {
    private byte[] example;

    public AsciiCharSequence(byte[] example) {
        this.example = example;
    }

    @Override
    public String toString() {
        String c = "";
        for (int i = 0; i < example.length; i++) {
            String b = Character.toString((char) example[i]);
            c += b;
        }
        return c;
    }

    @Override
    public int length() {
        return example.length;
    }

    @Override
    public char charAt(int index) {
        return (char) example[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        byte[] sub = new byte[end - start];
        for (int i = start, j = 0; i < end; i++, j++) {
            sub[j] = example[i];
        }
        return new AsciiCharSequence(sub);
    }
}

class Main {

    public static void main(String[] args) {

        byte[] example = {72, 101, 108, 108, 111, 33};
        AsciiCharSequence answer = new AsciiCharSequence(example);
        System.out.println(answer.toString());//Hello!
        System.out.println(answer.length());//6
        System.out.println(answer.charAt(1));//e
        System.out.println(answer.subSequence(1, 5));//ello
    }

}
