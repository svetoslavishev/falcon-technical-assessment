package com.ishev.bookstorerestapi;

import com.ishev.bookstorerestapi.models.BoardGame;
import com.ishev.bookstorerestapi.models.Book;
import com.ishev.bookstorerestapi.models.EBook;
import com.ishev.bookstorerestapi.models.Item;
import org.hibernate.SessionFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BookstorerestapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookstorerestapiApplication.class, args);
    }

    @Bean
    public SessionFactory sessionFactory() {
        return new org.hibernate.cfg.Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(BoardGame.class)
                .addAnnotatedClass(Book.class)
                .addAnnotatedClass(EBook.class)
                .addAnnotatedClass(Item.class)
                .buildSessionFactory();
    }

}
