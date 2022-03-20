package ru.netology.homeworkjdbc.repository;

import lombok.AllArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import ru.netology.homeworkjdbc.entity.Customers;
import ru.netology.homeworkjdbc.entity.Orders;

import javax.persistence.EntityManager;
import java.sql.Date;
import java.util.Random;
import java.util.stream.IntStream;

@Component
@AllArgsConstructor
public class LoaderEntity implements ApplicationRunner {

    EntityManager entityManager;
    @Override
    @Transactional
    public void run(ApplicationArguments args) throws Exception {
        var names = java.util.List.of("alexey", "karl", "rex", "bob");
        var surnames = java.util.List.of("smith", "fox", "west", "ford");
        var phoneNumbers = java.util.List.of("1111", "2222", "3333", "4444");
        var random = new Random();

        IntStream.range(0, 10)
                .forEach(i -> {
                    var customer = Customers.builder()
                            .name(names.get(random.nextInt(names.size())))
                            .surname(surnames.get(random.nextInt(surnames.size())))
                            .age(random.nextInt(90))
                            .phoneNumber(phoneNumbers.get(random.nextInt(phoneNumbers.size())))
                            .build();
                    entityManager.persist(customer);
                });

        var date = java.util.List.of(Date.valueOf("2017-11-15"), Date.valueOf("2022-11-15"), Date.valueOf("2020-11-15"), Date.valueOf("2019-11-15"));
        var productName = java.util.List.of("car", "bob", "beer", "spring");

        IntStream.range(0, 10)
                .forEach(i -> {
                    var order = Orders.builder()
                            .date(date.get(random.nextInt(date.size())))
                            .customerId(random.nextInt(4))
                            .productName(productName.get(random.nextInt(productName.size())))
                            .amount((random.nextInt(20000)))
                            .build();
                    entityManager.persist(order);
                });

    }
}
