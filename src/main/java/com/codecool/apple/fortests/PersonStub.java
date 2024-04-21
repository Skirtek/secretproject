package com.codecool.apple.fortests;

public class PersonStub implements Person {
    @Override
    public boolean applyForJob() {
        return false;
    }

    @Override
    public int checkAccountStatus() {
        return 30;
    }
}
