package org.alexz.hw_exc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PasswordChecker passwordChecker = new PasswordChecker();
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Введите минимальную длинну пароля: ");
            int minLength = Integer.parseInt(sc.nextLine());
            passwordChecker.setMinLength(minLength);
            System.out.println("Введите макс. допустимое количество повторений символа подряд: ");
            int maxRepeats = Integer.parseInt(sc.nextLine());
            passwordChecker.setMaxRepeats(maxRepeats);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }

        while (true) {
            System.out.println("Введите пароль или end: ");
            String pass = sc.nextLine();
            if (pass.equals("end")) {
                return;
            }

            System.out.println(passwordChecker.verify(pass) ? "Подходит!" : "Не подходит!");
        }
    }
}
