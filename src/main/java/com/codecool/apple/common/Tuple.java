package com.codecool.apple.common;

public class Tuple<Item1, Item2> {
    private final Item1 item1;
    private final Item2 item2;

    public Tuple(Item1 item1, Item2 item2) {
        this.item1 = item1;
        this.item2 = item2;
    }

    public Item1 getItem1() {
        return item1;
    }

    public Item2 getItem2() {
        return item2;
    }
}
