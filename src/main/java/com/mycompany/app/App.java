package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Hello World!";
    private final String proof = "Work";
    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String proofOfWork() {
        return proof;
    }
    
    private final String getMessage() {
        return message;
    }

}
