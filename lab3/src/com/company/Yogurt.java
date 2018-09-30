package com.company;

import java.util.Date;

public abstract class Yogurt extends MilkProduct {
    protected String taste;
    protected int volumeMl;
    protected int termination;

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
    public abstract void getManufacturer();
}
