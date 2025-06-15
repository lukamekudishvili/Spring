package com.lukaCode.sec03;

import com.lukaCode.generatedModel.sec03.Book;
import com.lukaCode.generatedModel.sec03.Library;

import java.util.List;

public class Lec05Collection {
    public static void main(String[] args) {
        var book1 = Book.newBuilder()
                .setTitle("Harry Potter - part 1")
                .setAuthor("J.K. Rowling")
                .setPublicationYear(1997).build();

        var book2 = book1.toBuilder()
                .setTitle("Harry Potter - part 2")
                .setPublicationYear(1998).build();

        var book3 = book1.toBuilder()
                .setTitle("Harry Potter - part 3")
                .setPublicationYear(1999).build();

        //bad practice
//        var library=Library.newBuilder()
//                .setName("Fantasy library")
//                .addBooks(book1)
//                .addBooks(book2)
//                .addBooks(book3).build();

        var library = Library.newBuilder()
                .setName("Fantasy library")
                .addAllBooks(List.of(book2, book1, book3))
                .build();


        System.out.println("Book1: \n" + book1);
        System.out.println("-".repeat(30));

        System.out.println("Book2: \n" + book2);
        System.out.println("-".repeat(30));

        System.out.println("Book3: \n" + book3);
        System.out.println("-".repeat(30));

        System.out.println("Library: \n" + library);
        System.out.println("-".repeat(30));
    }
}
