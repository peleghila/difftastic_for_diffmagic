public class Main {
    public static int foo() {
        System.out.println("old");
        return 3;
    }

    public static void main(String[] args) {
        int x = foo();
        System.out.println(x);
    }
}
