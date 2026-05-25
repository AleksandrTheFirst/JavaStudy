package org.alexz.hw6;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Первая книга в жизни"
                , 2003
                , new Author("Александр", "Захаров", 5)
                , 200);

        System.out.println(book.estimatePrice());
        System.out.println(book.isBig());
        System.out.println(book.matches("книга"));
        System.out.println(book.matches("Александр"));
        System.out.println(book.matches("Кошка"));
    }
}
