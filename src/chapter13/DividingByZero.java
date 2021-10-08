package chapter13;

public class DividingByZero {
    public static void main(String[] args) {
        zeroDivision();
    }

    private static void zeroDivision() {
        try {
            int c = 30 / 0;
        } catch (ArithmeticException ex) {
            ex.printStackTrace();
        } finally {
            System.out.println("Division is fun");
        }
    }
}
