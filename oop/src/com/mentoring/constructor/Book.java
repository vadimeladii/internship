package com.mentoring.constructor;

class Book {

    String title;

    String author;

    int year;

    double cost;

    Book(String title, String author, int year, double cost) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.cost = cost;
    }

    Book(int year, double cost) {
        this.year = year;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", cost=" + cost +
                '}';
    }
}
