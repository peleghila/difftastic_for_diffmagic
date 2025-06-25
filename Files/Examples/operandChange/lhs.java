public class Prog {
    public static void main(String[] args) {
        try {
            int a = 5 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        }
    }

    public static void foo() {
    }
}
