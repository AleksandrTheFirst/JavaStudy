package org.alexz.hw1;


import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {

        // Задание 1
        // Напишите программу, которая при запуске выводит ваше имя и фамилию на латинице.
        System.out.println("Задание 1:");
        String firstName = "Aleksandr";
        String lastName = "Zakharov";
        System.out.printf("%s %s", firstName, lastName);
        System.out.println("\n");

        // Задание 2
        // Напишите программу, в которой заведены две целочисленные переменные:
        // income для хранения размера доходов
        // spending для хранения размера расходов
        // Программа должна выводить на экран сообщение о том,
        // сколько денег осталось на счету.
        // Не считайте в уме итоговую сумму, расчёт итоговой суммы должна производить сама программа.

        System.out.println("Задание 2:");
        int income;
        int spending;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму дохода:");
        income = scanner.nextInt();
        System.out.println("Введите сумму расходов:");
        spending = scanner.nextInt();
        System.out.println("Итого (руб):\n" + (income - spending));
    }
}