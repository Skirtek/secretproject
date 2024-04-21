package com.codecool.apple.fortests;

import java.util.List;

public class PersonImpl implements Person {
    private final List<Person> relatedPersons;

    public PersonImpl(List<Person> relatedPersons) {
        this.relatedPersons = relatedPersons;
    }

    @Override
    public boolean applyForJob() {
        for (Person person : relatedPersons) {

        }
        // 30 lines of logic

        return true;
    }

    @Override
    public int checkAccountStatus() {
        // 40 lines of logic

        // ask bank service to give permission to account

        return 321;
    }
}
