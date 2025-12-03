public class Main {
    public static float foo() {
        System.out.println("new");
        return 3.0;
    }

    public static void main(String[] args) {
        float x = foo();
        System.out.println(x);
    }
}
