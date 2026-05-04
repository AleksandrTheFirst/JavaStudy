package org.alexz.hw3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        short year;
        short days;
        short correctDays;
        while (true) {
            System.out.println("Введите год в формате yyyy:");
            year = scanner.nextShort();
            correctDays = countDays(year);
            System.out.println("Введите количество дней:");
            days = scanner.nextShort();
            if (days == correctDays) {
                counter++;
            } else {
                System.out.println("Неправильно! В этом году " + correctDays + " дней!");
                System.out.println("Набрано очков: " + counter);
                break;
            }
        }
    }

    static short countDays(short year) {
        short days;
        if ((year % 400 == 0) || (year % 4 == 0)) {
            days = 366;
        } else if (year % 100 == 0) {
            days = 365;
        } else {
            days = 365;
        }

        return days;
    }
}
