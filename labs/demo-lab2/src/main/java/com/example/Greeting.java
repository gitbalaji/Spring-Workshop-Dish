package com.example;

class Greeting {
    private String message;
    private String greeting;
    private boolean happyToSeeYou;

    public Greeting(String message, String greeting, boolean happyToSeeYou) {
        this.message = message;
        this.greeting = greeting;
        this.happyToSeeYou = happyToSeeYou;
    }

    public String getMessage() {
        return message;
    }

    public String getGreeting() {
        return greeting;
    }

    public boolean isHappyToSeeYou() {
        return happyToSeeYou;
    }
}
