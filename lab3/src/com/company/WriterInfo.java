package com.company;
import java.util.Date;

public class WriterInfo {
    public static void printProduct(MilkProduct product) {
        System.out.println("Белок: " + product.getProtein() + "%");
        System.out.println("Жиры: " + product.getFat() + "%");
        System.out.println("Срок годности: " + formatDate(product.getShelfLife()));
        product.getManufacturer();
    }

    public static void printYogurt(Yogurt product) {
        System.out.println("\nЙогурт");
        WriterInfo.printProduct(product);
        System.out.println("Добавка: " + product.getTaste());
        System.out.println("Объем: " + product.getVolumeMl() + " мл");
        System.out.println("Терминированность: " + product.getTermination() + " °C");
    }

    public static void printCottageCheese(CottageCheese product) {
        System.out.println("\nТворог");
        WriterInfo.printProduct(product);
        System.out.println("Масса: " + product.getWeight() + " г");
        System.out.println("Зернистость: " + (product.isSmallGrain() ? "мелкая" : "крупная"));
    }

    public static void printKefir(Kefir product) {
        System.out.println("\nКефир");
        WriterInfo.printProduct(product);
        System.out.println("Бифидобактерии: " + product.getBifidobacterium() + " * 10^7");
        System.out.println("Объём: " + product.getVolumeMl() + " мл");
    }

    static String formatDate(Date dateOne) {
        long difference = dateOne.getTime() - (new Date()).getTime();
        int days =  (int)(difference / (24 * 60 * 60 * 1000));
        return days + " дн.";
    }
}
