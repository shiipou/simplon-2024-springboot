package fr.simplon.api.controllers;

import java.util.List;

import javax.lang.model.UnknownEntityException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.simplon.api.messages.CreateBookMessage;
import fr.simplon.api.models.Book;
import fr.simplon.api.models.User;
import fr.simplon.api.repositories.BookRepository;
import fr.simplon.api.repositories.UserRepository;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private final BookRepository bookRepository;
    private final UserRepository userRepository;

    public BookController(BookRepository bookRepository, UserRepository userRepository){
        this.bookRepository = bookRepository;
        this.userRepository = userRepository;
    }

    @GetMapping
    public List<Book> listAllBooks() {
        return bookRepository.findAll();
    }

    @PostMapping
    public Book createBook(@RequestBody CreateBookMessage book) throws Exception {
        User user = userRepository.findById(book.getAuthor()).orElseThrow(()->new Exception("Author not found"));
        Book newBook = new Book();
        newBook.setName(book.getName());
        newBook.setAuthor(user);
        return bookRepository.save(newBook);
    }
}
