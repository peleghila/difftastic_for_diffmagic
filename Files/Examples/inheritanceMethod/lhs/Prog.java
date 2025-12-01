class Animal {

    Animal() {
    }

    void speak() {
        System.out.println("Dad");
    }
}

class Dog extends Animal {

    Dog() {
        super();
    }

    @Override
    void speak() {
        System.out.println("Son");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.speak();
    }
}
