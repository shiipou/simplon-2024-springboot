package fr.simplon.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.simplon.api.models.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
