package com.example.demo.service;

import com.example.demo.domain.Item;
import com.example.demo.dto.DemoDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.demo.repository.DemoRepository;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class DemoServiceImpl implements DemoService{

    private final DemoRepository demoRepository;

    @Override
    public Boolean addPost(DemoDto.addParam param) throws Exception {
        Item item = new Item(param.getTitle(), param.getContent(), param.getPrice(), param.getUsername());
        demoRepository.save(item);
        return true;
    }

    @Override
    public List<Item> readPost() throws Exception {
        return demoRepository.findAll();
    }

    @Override
    public Boolean modifyPost(long id, DemoDto.addParam param) throws Exception {
        demoRepository.modifyPost(id, param.getTitle(), param.getContent(), param.getPrice(), param.getUsername());
        return true;
    }

    @Override
    public Boolean deletePost(long id) throws Exception {
        demoRepository.deleteById(id);
        return true;
    }
}
