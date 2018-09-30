package com.company;

import java.util.Date;
import java.text.*;

public class Main {
    public static void main(String[] args) {
        String dateString = "30.10.2018";
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        Date date = null;
        try {
            date = format.parse(dateString);
        } catch (Exception e) {
            e.printStackTrace();
        }
        DrinkingYogurt drinkingYogurt = new DrinkingYogurt(12.2f, 16.3f, date, "Савушкин", "Клубника", 120, 60);
        WriterInfo.printDrinkingYogurt(drinkingYogurt);
        GlassYogurt glassYogurt = new GlassYogurt(12.2f, 16.3f, date, "Савушкин", "Клубника", 120, 60);
        WriterInfo.printGlassYogurt(glassYogurt);
        Kefir kefir = new Kefir(12.2f, 16.3f, date, "Молочные горки", 1000, 2.5f);
        WriterInfo.printKefir(kefir);
        CottageCheese cottageCheese = new CottageCheese(12.2f, 16.3f, date, "Ласковое лето", 200, true);
        WriterInfo.printCottageCheese(cottageCheese);
    }
}
