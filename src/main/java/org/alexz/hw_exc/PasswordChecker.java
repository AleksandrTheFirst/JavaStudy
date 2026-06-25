package org.alexz.hw_exc;

public class PasswordChecker {
    private int minLength = -1;
    private int maxRepeats = -1;

    public void setMinLength(int length) {
        if (length < 0) {
            throw new IllegalArgumentException("Число должно быть положительным и больше нуля!");
        } else {
            this.minLength = length;
        }
    }

    public void setMaxRepeats(int repeats) {
        if (repeats < 1) {
            throw new IllegalArgumentException("Число должно быть положительным и больше нуля!");
        } else {
            this.maxRepeats = repeats;
        }
    }

    public boolean verify(String password) {
        if (minLength == -1 || maxRepeats == -1) {
            throw new IllegalStateException("Нужно выставить хотя бы одну настройку Чеккеру!");
        }

        if (password.length() < minLength) {
            return false;
        }

        int counter = 0;
        char previous = 0;

        for (char letter : password.toCharArray()) {
            if (letter ==previous) {
                counter++;
            } else {
                counter = 1;
            }

            if (counter > maxRepeats) {
                return false;
            }
        }

        return true;
    }
}
