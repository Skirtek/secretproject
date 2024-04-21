package com.codecool.apple.fortests;

public class AgeCheck {
    public int calculatePersonRatio(Person person){
        return person.checkAccountStatus() * 30;
    }

    public int getAdultAgeFromDatabase(){
        return 0;
    }

    public boolean isAdult(int age) {
        return age >= 18;
    }
}
