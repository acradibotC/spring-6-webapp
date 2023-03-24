package com.acadibotc.springframework.spring6webapp.services;

import com.acadibotc.springframework.spring6webapp.domain.Author;

public interface AuthorService {

    Iterable<Author> findAll();
}
