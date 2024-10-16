package com.word.engword.api.enumeration;

import java.util.stream.Stream;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PartsOfSpeech {
    NOUN("noun", "명사"),
    PRONOUN("pronoun", "대명사"),
    VERB("verb", "동사"),
    ADJECTIVE("adjective", "형용사"),
    CONJUNCTION("confunction", "접속사"),
    PREPOSITION("preposition", "전치사"),
    INTERJECTION("interjection","감탄사");

    final String parts;
    final String description;

    @JsonIgnore
	public PartsOfSpeech of(String parts) {
		return Stream.of(PartsOfSpeech.values())
			.filter(p -> p.getPartsName().equals(parts))
			.findFirst()
			.orElse(null);
	}

    @JsonIgnore
    public String getPartsName() {
        return this.parts;
    }

    @JsonIgnore
    public String getDescription() {
        return this.description;
    }
}
