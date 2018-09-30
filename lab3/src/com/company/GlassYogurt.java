package com.company;

import java.util.Date;

public class GlassYogurt extends Yogurt {
    GlassYogurt(float protein, float fat, Date shelfLife, String manufacturer, String taste, int volumeMl, int termination) {
        super(protein, fat, shelfLife, manufacturer, taste, volumeMl, termination);
    }

    @Override
    public void getManufacturer() {
        System.out.println("Производитель йогурта в стаканчике: " + super.manufacturer);
    }
}
