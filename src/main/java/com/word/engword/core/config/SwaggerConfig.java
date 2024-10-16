package com.word.engword.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
        .components(new Components())
        .info(apiInfo());
    }
    private Info apiInfo() {
        return new Info().title("영단어 api").description("영단어 암기 테스트용 api").version("1.0.0");
    }
}
