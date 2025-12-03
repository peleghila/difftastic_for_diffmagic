class Base {
    public void bar() {
        System.out.println("Base bar");
    }
}

class Derived extends Base {
    @Override
    public void bar() {
        System.out.println("Derived bar");
    }
}

public class Main {
    public static void main(String[] args) {
        Base b = new Base();
        Derived d = new Derived();
        Base poly = new Derived();

        b.bar();      // Base bar
        d.bar();      // Derived bar
        poly.bar();   // Derived bar (polymorphism)
    }
}
