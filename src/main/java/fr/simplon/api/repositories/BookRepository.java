package fr.simplon.api.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import fr.simplon.api.models.Book;

@RepositoryRestResource
public interface BookRepository extends CrudRepository<Book, Integer>{
    
}
