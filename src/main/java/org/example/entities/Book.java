package org.example.entities;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
@Entity
@Table(name = "books")
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@ToString
public class Book {
    @Id//primary key ,not null
    @GeneratedValue (strategy = GenerationType.SEQUENCE,generator = "book_generator")
    @SequenceGenerator(name = "book_generator",
    sequenceName = "book_seg_generator",
    allocationSize = 1)
    private Long id;
    private String name;
    private String author;
    private BigDecimal price;

    public Book(String name, String author, BigDecimal price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }
}
