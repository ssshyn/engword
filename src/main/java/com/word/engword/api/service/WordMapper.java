package com.word.engword.api.service;

import java.util.Optional;

import com.word.engword.api.domain.Word;
import com.word.engword.api.domain.WordCreated;
import com.word.engword.api.repository.EngWordEntity;

public class WordMapper {
    public static Word toWord(EngWordEntity engWordEntity) {
        return Optional.of(engWordEntity).isPresent() ? Word.builder()
        .id(engWordEntity.getId())
        .createdAt(engWordEntity.getCreatedAt())
        .modifiedAt(engWordEntity.getModifiedAt())
        .engWord(engWordEntity.getEngWord())
        .korWordList(KorWordMapper.toKorWordList(engWordEntity.getKorWord()))
        .build() : null;
    }

    public static WordCreated toWordCreated(Optional<EngWordEntity> engWordEntity) {
        return engWordEntity.isPresent() ? WordCreated.builder()
        .id(engWordEntity.get().getId())
        .createdAt(engWordEntity.get().getCreatedAt())
        .engWord(engWordEntity.get().getEngWord())
        .korWordList(KorWordMapper.toKorWordList(engWordEntity.get().getKorWord()))
        .build() : null;
    }
}
