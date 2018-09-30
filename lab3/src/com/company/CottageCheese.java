package com.company;

import java.util.Date;

public class CottageCheese extends MilkProduct {
    private int weight;
    private boolean grain;

    CottageCheese() {}

    CottageCheese(float protein, float fat, Date shelfLife, String manufacturer, int weight, boolean grain) {
        super(protein, fat, shelfLife, manufacturer);
        this.weight = weight;
        this.grain = grain;
    }

    public int getWeight() {
        return weight;
    }

    public boolean isSmallGrain() {
        return grain;
    }

    @Override
    public void getManufacturer() {
        System.out.println("Производитель творога: " + super.manufacturer);
    }
}
