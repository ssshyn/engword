package com.word.engword.api.domain;

import java.time.LocalDateTime;
import java.util.List;

import com.word.engword.api.enumeration.PartsOfSpeech;
import com.word.engword.api.repository.KorWordEntity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Schema(description = "국문해석 meta domain")
public class KorWordMeta {
    @Schema(description = "id")
    private Long id;
    @Schema(description = "등록일자")
    private LocalDateTime createdAt;
    @Schema(description = "수정일자")
    private LocalDateTime modifiedAt;
    @Schema(description = "품사")
    private PartsOfSpeech partsOfSpeech;
    @Schema(description = "국문해석")
    private String korWord;
}
