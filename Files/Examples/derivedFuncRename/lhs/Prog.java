class Base {
    public void foo() {
        System.out.println("Base foo");
    }
}

class Derived extends Base {
    @Override
    public void foo() {
        System.out.println("Derived foo");
    }
}

public class Main {
    public static void main(String[] args) {
        Base b = new Base();
        Derived d = new Derived();
        Base poly = new Derived();

        b.foo();      // Base foo
        d.foo();      // Derived foo
        poly.foo();   // Derived foo (polymorphism)
    }
}
