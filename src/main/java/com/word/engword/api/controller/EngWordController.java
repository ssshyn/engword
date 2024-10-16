package com.word.engword.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.word.engword.api.domain.Word;
import com.word.engword.api.domain.WordCreated;
import com.word.engword.api.request.WordCreateRequest;
import com.word.engword.api.service.WordUseCase;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequiredArgsConstructor
@RequestMapping("/word")
@Tag(name = "영단어 api")
public class EngWordController {

    private final WordUseCase wordUseCase;

    @GetMapping
    public ResponseEntity<List<Word>> findAll() {
        return ResponseEntity.ok().body(wordUseCase.findAll());
    }

    @GetMapping("/random")
    public ResponseEntity<List<Word>> findRandom(@RequestParam(value = "count") Integer count) {
        return ResponseEntity.ok().body(wordUseCase.findRandom(count));
    }

    @PostMapping
    public ResponseEntity<WordCreated> create(@RequestBody WordCreateRequest wordCreateRequest) {
        return ResponseEntity.ok().body(wordUseCase.create(wordCreateRequest));
    }
    
    // POST 단어 등록
    // GET 단어 전체 목록
    // GET 단어 랜덤 (개수설정)
    // PUT 테스트 결과 저장
}
