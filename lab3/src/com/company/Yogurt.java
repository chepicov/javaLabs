package com.company;

import java.util.Date;

public class Yogurt extends MilkProduct {
    private String taste;
    private int volumeMl;
    private int termination;

    Yogurt() {}

    Yogurt(float protein, float fat, Date shelfLife, String manufacturer, String taste, int volumeMl, int termination) {
        super(protein, fat, shelfLife, manufacturer);
        this.taste = taste;
        this.volumeMl = volumeMl;
        this.termination = termination;
    }

    public String getTaste() {
        return taste;
    }

    public int getVolumeMl() {
        return volumeMl;
    }

    public int getTermination() {
        return termination;
    }

    @Override
    public void getManufacturer() {
        System.out.println("Производитель йогурта: " + super.manufacturer);
    }
}
