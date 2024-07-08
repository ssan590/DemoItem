package com.example.demo.service;

import com.example.demo.domain.Item;
import com.example.demo.dto.DemoDto;

import java.util.List;

public interface DemoService {
    Boolean addPost(DemoDto.addParam param) throws Exception;

    List<Item> readPost() throws Exception;

    Boolean modifyPost(long id, DemoDto.addParam param) throws Exception;

    Boolean deletePost(long id) throws Exception;
}
