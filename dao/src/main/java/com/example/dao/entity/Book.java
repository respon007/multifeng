package com.example.dao.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Book {
    private Integer id;
    private String name;
    private String author;
    private Float price;

    /**
     * 我练习一下提交
     * @return
     */

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
