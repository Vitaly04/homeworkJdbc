package ru.netology.homeworkjdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ru.netology.homeworkjdbc.repository.JdbcRepository;
import ru.netology.homeworkjdbc.service.JdbcService;

@SpringBootApplication
public class HomeworkJdbcApplication  {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(HomeworkJdbcApplication.class);
        JdbcRepository jdbcRepository = context.getBean(JdbcRepository.class);
        JdbcService jdbcService = context.getBean(JdbcService.class);
    }
}
