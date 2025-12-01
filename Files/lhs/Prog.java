package com.example;

import java.util.Random;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Helper h = new Helper();
        System.out.println(h.randomNumber());
    }
}

class Helper {
    int randomNumber() {
        return new Random().nextInt(10);
    }
}
