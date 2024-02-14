package com.openapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Schema(description = "Objeto Book")
@Entity
@Table(name = "books")
public class Book {

    @JsonProperty(value = "id", required = true, index = 10)
    @Schema(description = "Identificador único de Book.", example = "1", required = true)
    private long id;

    @JsonProperty(value = "title", required = true, index = 20)
    @Schema(description = "Nombre del título.", example = "Java", required = true)
    @NotBlank
    @Size(min = 0, max = 20)
    private String title;

    @JsonProperty(value = "author", required = true, index = 30)
    @Schema(description = "Nombre del autor.", example = "Max Abi", required = true)
    @NotBlank
    @Size(min = 0, max = 30)
    private String author;

    public Book() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "title", nullable = false)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "author", nullable = false)
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}