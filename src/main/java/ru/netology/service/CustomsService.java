package ru.netology.service;

public class CustomsService {
    public static final double PRICE_RATE = 0.01;
    public static final int WEIGHT_RATE = 100;

    public static int calculateCustoms(int price, int weight) {
        return (int) (price * PRICE_RATE + weight * WEIGHT_RATE);
    }
}
