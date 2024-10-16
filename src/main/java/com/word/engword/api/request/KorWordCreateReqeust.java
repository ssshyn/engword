package com.word.engword.api.request;

import com.word.engword.api.enumeration.PartsOfSpeech;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "해석 등록 요청 model")
public class KorWordCreateReqeust {
    @Schema(description = "품사")
    private PartsOfSpeech partsOfSpeech;
    @Schema(description = "국문해석")
    private String korWord;
}
