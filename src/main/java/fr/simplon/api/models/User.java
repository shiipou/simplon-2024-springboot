package fr.simplon.api.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

// CREATE TABLE users (
//     id SERIAL PRIMARY KEY,
//     username VARCHAR(255) NOT NULL UNIQUE,
//     name VARCHAR(255),
//     password VARCHAR(255)
// )

// SELECT * FROM user u JOIN book b ON u.id = b.creator;

@Entity
@Data
@RequiredArgsConstructor
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(nullable = false, unique = true)
    @NonNull
    private String username;

    private String name;
    @JsonIgnore
    private String password;
    private String email;

    public User(){}

    // Generated by @Data

    // public User(@NonNull String username) {
    //     this.username = username;
    // }

    // public Integer getId() {
    //     return id;
    // }

    // public void setId(Integer id) {
    //     this.id = id;
    // }

    // public String getUsername() {
    //     return username;
    // }

    // public void setUsername(String username) {
    //     this.username = username;
    // }

    // public String getName() {
    //     return name;
    // }

    // public void setName(String name) {
    //     this.name = name;
    // }

    // public String getPassword() {
    //     return password;
    // }

    // public void setPassword(String password) {
    //     this.password = password;
    // }

    // public String getEmail() {
    //     return email;
    // }

    // @Override
    // public String toString() {
    //     return "User [id=" + id + ", username=" + username + ", name=" + name + ", password=" + password + ", email="
    //             + email + ", books=" + books + "]";
    // }

    // @Override
    // public boolean equals(Object obj) {
    //     // TODO Auto-generated method stub
    //     return super.equals(obj);
    // }

    // @Override
    // public int hashCode() {
    //     // TODO Auto-generated method stub
    //     return super.hashCode();
    // }

    // public void setEmail(String email) {
    //     this.email = email;
    // }

    // public List<Book> getBooks() {
    //     return books;
    // }

    // public void setBooks(List<Book> books) {
    //     this.books = books;
    // }

    // Generated by RequiredArgConstructor
    // public User(String username) {
    //     this.username = username;
    // }


    
}
