package org.alexz.hw_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\nВыберите операцию:");
            System.out.println();
            System.out.println("0. Выход из программы");
            System.out.println("1. Добавить дело");
            System.out.println("2. Показать дела");
            System.out.println("3. Удалить дело по номеру");
            System.out.println("4. Удалить дело по названию");
            System.out.print("Ваш выбор: ");

            if (!scanner.hasNextInt()) {
                scanner.next();
                continue;
            }

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    System.out.println("Выход из программы.");
                    return;
                case 1:
                    System.out.println();
                    System.out.print("Введите название задачи: ");
                    String task = scanner.nextLine();
                    if (task.trim().isEmpty()) {
                        System.out.println("Название задачи не может быть пустым.");
                        break;
                    }

                    tasks.add(task);
                    System.out.println("Добавлено!");
                    printTasks(tasks);
                    break;
                case 2:
                    System.out.println();
                    printTasks(tasks);
                    break;
                case 3:
                    if (tasks.isEmpty()) {
                        System.out.println("Список дел пуст.");
                        break;
                    }

                    System.out.println();
                    System.out.print("Введите номер для удаления: ");
                    int index;
                    if (!scanner.hasNextInt()) {
                        scanner.next();
                        System.out.println("Некорректный ввод.");
                        break;
                    }

                    index = scanner.nextInt();
                    scanner.nextLine();

                    if (index < 1 || index > tasks.size()) {
                        System.out.println("Неверный номер задачи.");
                        break;
                    }

                    tasks.remove(index - 1);
                    System.out.println("Удалено!");
                    printTasks(tasks);
                    break;
                case 4:
                    if (tasks.isEmpty()) {
                        System.out.println("Список дел пуст.");
                        break;
                    }

                    System.out.println();
                    System.out.print("Введите задачу для удаления: ");
                    String taskToRemove = scanner.nextLine();
                    boolean removed;
                    if (tasks.contains(taskToRemove)) {
                        tasks.remove(taskToRemove);
                        removed = true;
                    } else removed = false;

                    if (removed) {
                        System.out.println("Удалено!");
                        printTasks(tasks);
                    } else {
                        System.out.println("Задача не найдена.");
                    }
                    break;
                default:
                    System.out.println("Неверная операция. Выберите число от 0 до 4.");
            }
        }
    }

    private static void printTasks(List<String> tasks) {
        System.out.println("Ваш список дел:");
        if (tasks.isEmpty()) {
            System.out.println("(список пуст)");
            return;
        }
        for (int i = 1; i < tasks.size(); i++) {
            System.out.println(i + ". " + tasks.get(i));
        }
    }
}