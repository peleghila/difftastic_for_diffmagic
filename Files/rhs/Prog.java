

import java.util.Random;


public class Main {
    public static void main(String[] args) {
        Helper h = new Helper();
        System.out.println(h.randomNumberChange());
    }
}

class Helper {
    int randomNumberChange() {
        return new Random().nextInt(10);
    }
}
