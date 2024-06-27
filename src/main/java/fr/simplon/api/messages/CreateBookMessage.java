package fr.simplon.api.messages;

import lombok.Getter;

@Getter
public class CreateBookMessage {
    private String name;
    private Integer author;
}
