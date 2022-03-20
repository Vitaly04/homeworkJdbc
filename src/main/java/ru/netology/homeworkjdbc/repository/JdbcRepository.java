package ru.netology.homeworkjdbc.repository;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import java.util.List;


@Repository
public class JdbcRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List getProductName(@RequestParam("name") String name) {

        return entityManager.createQuery("select o.productName from Orders o join Customers c on o.customerId = c.id where c.name like '" + name + "'", String.class)
                .getResultList();
    }
}
