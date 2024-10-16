package com.word.engword.api.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.word.engword.api.domain.KorWord;
import com.word.engword.api.repository.KorWordEntity;
import com.word.engword.api.request.KorWordCreateReqeust;

public class KorWordMapper {
    public static List<KorWord> toKorWordList(List<KorWordEntity> entityList) {
        List<KorWord> result = new ArrayList<>();

        entityList.forEach(
            entity -> {
                result.add(toKorWord(entity));
            }
        );

        return result;
    }

    public static KorWord toKorWord(KorWordEntity korWordEntity) {
        return Optional.of(korWordEntity).isPresent() ? KorWord.builder()
        .id(korWordEntity.getId())
        .createdAt(korWordEntity.getCreatedAt())
        .modifiedAt(korWordEntity.getModifiedAt())
        .partsOfSpeech(korWordEntity.getPartsOfSpeech())
        .korWord(korWordEntity.getKorWord())
        .build() : null;
    }

    public static List<KorWordEntity> toCreateKorWord(List<KorWordCreateReqeust> requestList) {
            return requestList.stream()
            .map(x -> KorWordEntity.builder()
            .korWord(x.getKorWord())
            .partsOfSpeech(x.getPartsOfSpeech())
            .build())
        .toList();
    }
}
