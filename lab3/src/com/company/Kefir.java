package com.company;

import java.util.Date;

public class Kefir extends MilkProduct {
    private int volumeMl;
    private float bifidobacterium;

    Kefir() {}

    Kefir(float protein, float fat, Date shelfLife, String manufacturer, int volumeMl, float bifidobacterium) {
        super(protein, fat, shelfLife, manufacturer);
        this.volumeMl = volumeMl;
        this.bifidobacterium = bifidobacterium;
    }

    public int getVolumeMl() {
        return volumeMl;
    }

    public float getBifidobacterium() {
        return bifidobacterium;
    }

    @Override
    public void getManufacturer() {
        System.out.println("Производитель кефира: " + super.manufacturer);
    }
}
