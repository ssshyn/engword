package com.word.engword.api.service;

import java.util.List;

import com.word.engword.api.domain.Word;
import com.word.engword.api.domain.WordCreated;
import com.word.engword.api.request.WordCreateRequest;

public interface WordUseCase {
    public List<Word> findAll();
    public List<Word> findRandom(Integer count);
    public WordCreated create(WordCreateRequest wordCreateRequest);
}
