package aze.coders.spring.mvc.service;

import aze.coders.spring.mvc.entity.Customers;

import java.util.List;

public interface CustomersService {   void save(Customers customers);

    void update(Customers customers);

    void delete(Integer id);

    Customers findById(Integer id);

    List<Customers> findAll();

    List<Customers> findByName(String name);
}
