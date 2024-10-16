package com.word.engword.api.request;

import java.util.List;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "단어 등록 요청 model")
public class WordCreateRequest {
    @Schema(description = "영단어")
    private String engWord;
    @Schema(description = "국문해석목록")
    private List<KorWordCreateReqeust> korWordList;
}
