package com.acadibotc.springframework.spring6webapp.services;

import com.acadibotc.springframework.spring6webapp.domain.Book;

public interface BookService {

    Iterable<Book> findAll();
}
