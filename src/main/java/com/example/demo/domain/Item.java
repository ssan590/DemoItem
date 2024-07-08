package com.example.demo.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.function.Supplier;

@Getter
@Entity
@Table(schema = "shop", name = "item")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Item {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "content")
    private String content;

    @Column(name = "price")
    private int price;

    @Column(name = "username")
    private String username;

    public Item(String title, String content, int price, String username) {
        this.title = title;
        this.content = content;
        this.price = price;
        this.username = username;
    }
}
