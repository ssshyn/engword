package com.word.engword.api.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.word.engword.api.domain.Word;
import com.word.engword.api.domain.WordCreated;
import com.word.engword.api.repository.EngWordEntity;
import com.word.engword.api.repository.WordDataProvider;
import com.word.engword.api.request.WordCreateRequest;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional
public class WordService implements WordUseCase{
    private final WordDataProvider wordDataProvider;

    @Override
    public List<Word> findAll() {
        return wordDataProvider.findAll().stream().map(WordMapper::toWord).toList();
    }

    @Override
    public List<Word> findRandom(Integer count) {
        Random random = new Random();
        List<EngWordEntity> wordList = wordDataProvider.findAll();

        return random.ints(count, 0, wordList.size())
        .mapToObj(i -> WordMapper.toWord(wordList.get(i)))
        .toList();
    }

    @Override
    public WordCreated create(WordCreateRequest wordCreateRequest){
        EngWordEntity engWordEntity = EngWordEntity.builder()
        .engWord(wordCreateRequest.getEngWord())
        .korWord(KorWordMapper.toCreateKorWord(wordCreateRequest.getKorWordList()))
        .build();

        return WordMapper.toWordCreated(wordDataProvider.create(engWordEntity));
    }
}
