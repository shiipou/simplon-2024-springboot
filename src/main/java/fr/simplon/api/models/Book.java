package fr.simplon.api.models;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Book {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    @ManyToOne
    private User author;

    public Book(){}
}
