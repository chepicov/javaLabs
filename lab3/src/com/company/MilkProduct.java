package com.company;

import java.util.Date;

public class MilkProduct {
    protected Date shelfLife;
    protected float protein;
    protected float fat;
    protected String manufacturer;

    MilkProduct() {}

    MilkProduct(float protein, float fat, Date shelfLife, String manufacturer) {
        this.protein = protein;
        this.fat = fat;
        this.shelfLife = shelfLife;
        this.manufacturer = manufacturer;
    }

    public Date getShelfLife() {
        return shelfLife;
    }

    public float getProtein() {
        return protein;
    }

    public float getFat() {
        return fat;
    }

    public void getManufacturer() {
        System.out.println("Производитель: " + manufacturer);
    }
}
