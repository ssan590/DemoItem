package com.example.demo.repository;

import com.example.demo.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface DemoRepository extends JpaRepository<Item, Long> {

    @Modifying
    @Query("update Item set title = :title, content = :content, price = :price, username = :username where id = :id")
    void modifyPost(Long id, String title, String content, int price, String username);

}
