package org.alexz.hw4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int income = 0;
        int expenses = 0;

        while (true) {
            System.out.println();
            System.out.println("Выберите операцию и введите её номер:");
            System.out.println("1. Добавить новый доход");
            System.out.println("2. Добавить новый расход");
            System.out.println("3. Выбрать систему налогообложения");
            System.out.println("**** Для выхода из программы напечатайте end и нажмите Enter ****");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("end")) {
                break;
            }

            int operator = Integer.parseInt(input);
            switch (operator) {
                case 1:
                    System.out.println("Введите сумму дохода:");
                    income += Integer.parseInt(scanner.nextLine());
                    break;
                case 2:
                    System.out.println("Введите сумму расхода:");
                    expenses += Integer.parseInt(scanner.nextLine());
                    break;
                case 3:
                    int incomeMinusExpensesTax = taxIncomeMinusExpenses(income, expenses);
                    int incomeTax = taxIncome(income);
                    if (incomeTax < incomeMinusExpensesTax) {
                        System.out.println("Мы советуем вам УСН Доходы");
                        System.out.printf("Ваш налог составит: %d рублей\n", incomeTax);
                        System.out.printf("Налог на другой системе: %d рублей\n", incomeMinusExpensesTax);
                        System.out.printf("Экономия: %d рублей\n", incomeMinusExpensesTax - incomeTax);

                    } else {
                        System.out.println("Мы советуем вам УСН Доходы минус расходы");
                        System.out.printf("Ваш налог составит: %d рублей\n", incomeMinusExpensesTax);
                        System.out.printf("Налог на другой системе: %d рублей\n", incomeTax);
                        System.out.printf("Экономия: %d рублей\n", incomeTax - incomeMinusExpensesTax);
                    }
                    break;
                default:
                    System.out.println("Такой операции нет");
            }
        }

        System.out.println("Программа завершена!");
    }

    // Расчет налога по формуле УСН доходы минус расходы
    public static int taxIncomeMinusExpenses(int income, int expenses) {
        int tax = (income - expenses) * 15 / 100;
        if (tax >= 0) {
            return tax;
        } else {
            // если расходы оказались больше, то налог посчитается отрицательным
            return 0;
        }
    }

    // Расчет налога по формуле УСН доходы
    public static int taxIncome(int income) {
        int tax = income * 6 / 100;
        if (tax >= 0) {
            return tax;
        } else {
            // если расходы оказались больше, то налог посчитается отрицательным
            return 0;
        }
    }
}
