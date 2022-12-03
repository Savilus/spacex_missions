package com.example.spacex_missions.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.DefaultUriBuilderFactory;
import org.springframework.web.util.DefaultUriTemplateHandler;
import org.springframework.web.util.UriTemplateHandler;

@Slf4j
@Configuration
public class ApiConfig {

    @Bean
    public DefaultUriBuilderFactory buildUriFactory(ApiConfigurationProperties apiConfigurationProperties){
        DefaultUriBuilderFactory builderFactory = new DefaultUriBuilderFactory(apiConfigurationProperties.getUrl());
        return builderFactory;
    }

    @Bean
    public RestTemplate getRestTemplate(DefaultUriBuilderFactory builderFactory){
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.setUriTemplateHandler(builderFactory);
        return  restTemplate;
    }
}
