package com.library.service;

import com.library.model.Book;
import com.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        System.out.println("Constructor Injection Successful");
        this.bookRepository = bookRepository;
    }

    public void setBookRepository(BookRepository bookRepository) {
        System.out.println("Setter Injection Successful");
        this.bookRepository = bookRepository;
    }

    public Book getBook() {
        return bookRepository.getBook();
    }
}
