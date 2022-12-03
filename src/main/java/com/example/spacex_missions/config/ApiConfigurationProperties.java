package com.example.spacex_missions.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
// pozwala podać springowi, dostęp w propertisach które są podane w nawiasie i dał dostęp do jego pól i nimi zarządzał
@ConfigurationProperties("sda.spacex")
public class ApiConfigurationProperties {

    String url;
    String missionsEndpoint;
}
