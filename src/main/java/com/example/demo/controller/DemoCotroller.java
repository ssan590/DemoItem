package com.example.demo.controller;

import com.example.demo.domain.Item;
import com.example.demo.dto.DemoDto;
import com.example.demo.service.DemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/post")
public class DemoCotroller {

    private final DemoService demoService;

    // 생성
    @PostMapping("")
    public Boolean addPost(@RequestBody DemoDto.addParam param) throws Exception {
        return demoService.addPost(param);
    }

    // 조회
    @GetMapping("")
    public List<Item> readPost() throws Exception {
        return demoService.readPost();
    }

    // 수정
    @PutMapping("/{id}")
    public Boolean modifyPost(@PathVariable long id, @RequestBody DemoDto.addParam param) throws Exception {
        return demoService.modifyPost(id, param);
    }

    // 삭제
    @DeleteMapping("/{id}")
    public Boolean deletePost(@PathVariable long id) throws Exception {
        return demoService.deletePost(id);
    }
}
