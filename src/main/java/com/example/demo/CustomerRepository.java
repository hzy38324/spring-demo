package com.example.demo;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author: nitzschhong
 * @create: 2022-07-16 10:57
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);

    Customer findById(long id);
}