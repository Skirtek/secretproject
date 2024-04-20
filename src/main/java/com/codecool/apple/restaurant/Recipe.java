package com.codecool.apple.restaurant;

public class Recipe {
    public double getDiscountForPartnersBad(double amount, PartnerType partnerType) {
        if (partnerType.equals(PartnerType.BRONZE)) {
            return amount -= amount * 0.05;
        } else if (partnerType.equals(PartnerType.SILVER)) {
            return amount -= amount * 0.1;
        } else if (partnerType.equals(PartnerType.GOLD)) {
            return amount -= amount * 0.15;
        } else if (partnerType.equals(PartnerType.PLATINIUM)) {
            return amount -= amount * 0.2;
        }

        return amount;
    }

    public double getDiscountForPartnersGood(double amount, PartnerType partnerType) {
        return amount -= amount * partnerType.getDiscountValue();
    }
}
