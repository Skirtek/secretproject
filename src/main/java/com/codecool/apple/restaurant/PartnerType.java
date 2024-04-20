package com.codecool.apple.restaurant;

public enum PartnerType {
    BRONZE(0.05),
    SILVER(0.1),
    GOLD(0.15),
    PLATINIUM(0.2),
    DIAMOND(0.3);

    private final double discountValue;

    PartnerType(double discountValue) {
        this.discountValue = discountValue;
    }

    public double getDiscountValue() {
        return discountValue;
    }
}
