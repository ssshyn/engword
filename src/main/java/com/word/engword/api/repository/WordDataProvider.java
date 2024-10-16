package com.word.engword.api.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.querydsl.jpa.impl.JPAQueryFactory;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class WordDataProvider {
    private final WordRepository wordRepository;

    public List<EngWordEntity> findAll() {
        return wordRepository.findAll();
    }

    public Optional<EngWordEntity> findById(Long id) {
        return wordRepository.findById(id);
    }
    
    public Optional<EngWordEntity> create(EngWordEntity engWordEntity) {
        return Optional.of(wordRepository.save(engWordEntity));
    }

    public Optional<EngWordEntity> update(EngWordEntity engWordEntity) {
        return Optional.of(wordRepository.save(engWordEntity));
    }
}
