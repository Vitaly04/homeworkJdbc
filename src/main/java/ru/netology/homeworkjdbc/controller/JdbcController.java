package ru.netology.homeworkjdbc.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.homeworkjdbc.service.JdbcService;

@AllArgsConstructor
@RestController
public class JdbcController {
    JdbcService jdbcService;

    @GetMapping("/products/fetch-product")
    public String getProductName(@RequestParam("name") String name) {
        return jdbcService.getProductName(name);
    }

}
