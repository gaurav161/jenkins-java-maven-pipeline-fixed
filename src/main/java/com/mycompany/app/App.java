package com.mycompany.app;

public class App {
    public String getMessage() {
        return "Hello World!"; // ✅ NO comma
    }

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }
}
