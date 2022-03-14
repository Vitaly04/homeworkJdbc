package ru.netology.homeworkjdbc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.netology.homeworkjdbc.repository.JdbcRepository;
import ru.netology.homeworkjdbc.service.JdbcService;

@Configuration
public class JavaConfig {

    @Bean
    public JdbcRepository jdbcRepository() {
        return new JdbcRepository();
    }

    @Bean
    public JdbcService jdbcService(JdbcRepository jdbcRepository) {
        return new JdbcService(jdbcRepository);
    }
}
