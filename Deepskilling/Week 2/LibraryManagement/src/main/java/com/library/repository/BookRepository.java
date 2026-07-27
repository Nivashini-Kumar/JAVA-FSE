package com.library.repository;

import com.library.model.Book;

public class BookRepository {

    public Book getBook() {
        return new Book(
                101,
                "Spring Framework",
                "Craig Walls"
        );
    }
}
