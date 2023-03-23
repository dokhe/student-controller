package com.keteso.studentcontroller.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.keteso.studentcontroller.repository")
public class AppConfig {
    // other configurations
}
