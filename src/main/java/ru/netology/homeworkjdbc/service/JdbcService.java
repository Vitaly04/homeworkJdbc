package ru.netology.homeworkjdbc.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import ru.netology.homeworkjdbc.repository.JdbcRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class JdbcService {
    JdbcRepository jdbcRepository;

    public List getProductName(@RequestParam("name") String name) {
        return jdbcRepository.getProductName(name);
    }
}
