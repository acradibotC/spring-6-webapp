package com.acadibotc.springframework.spring6webapp.bootstrap;

import com.acadibotc.springframework.spring6webapp.domain.Author;
import com.acadibotc.springframework.spring6webapp.domain.Book;
import com.acadibotc.springframework.spring6webapp.repositories.AuthorRepository;
import com.acadibotc.springframework.spring6webapp.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {


    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author hanhtn = new Author();
        hanhtn.setFirstName("Thích");
        hanhtn.setLastName("Nhất Hạnh");

        Book book = new Book();
        book.setTitle("Không Diệt Không Sinh Đừng Sợ Hãi");
        book.setIsbn("8935278607311");

        Author hanhtnSaved = authorRepository.save(hanhtn);
        Book bookSaved = bookRepository.save(book);

        Author rod = new Author();
        rod.setFirstName("Rod");
        rod.setLastName("Johnson");

        Book noEJB = new Book();
        noEJB.setTitle("J2EE Development without EJB");
        noEJB.setIsbn("8935273821372");

        Author rodSaved = authorRepository.save(rod);
        Book noEJBSaved = bookRepository.save(noEJB);

        hanhtnSaved.getBooks().add(book);
        rodSaved.getBooks().add(noEJBSaved);

        authorRepository.save(hanhtnSaved);
        authorRepository.save(rodSaved);


        System.out.println("In Bootstrap");
        System.out.println("Author Count:" + authorRepository.count());
        System.out.println("Book Count:" + bookRepository.count());

    }
}
