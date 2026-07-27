package com.library;

import com.library.model.Book;
import com.library.service.BookService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagementRunner {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService service =
                context.getBean("bookService", BookService.class);

        Book book = service.getBook();

        System.out.println("Book ID    : " + book.getId());
        System.out.println("Book Title : " + book.getTitle());
        System.out.println("Author     : " + book.getAuthor());

        context.close();
    }
}
