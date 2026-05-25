package org.alexz.hw6;

public class Book {
    public String title;
    public int releaseYear;
    public Author author;
    public int pages;

    public Book(String title, int releaseYear, Author author, int pages) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.author = author;
        this.pages = pages;
    }

    public boolean isBig() {
        return pages > 500;
    }

    public boolean matches(String word) {
        return (title.contains(word) || author.name.contains(word) || author.sureName.contains(word));
    }

    public int estimatePrice() {
        int price = (int) (pages * 3 * Math.floor(Math.sqrt(author.rating)));
        return (price > 249) ? price : 250;
    }


}
