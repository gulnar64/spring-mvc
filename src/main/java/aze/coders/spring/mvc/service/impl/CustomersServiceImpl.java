package aze.coders.spring.mvc.service.impl;

import aze.coders.spring.mvc.dao.CustomersDao;
import aze.coders.spring.mvc.entity.Customers;
import aze.coders.spring.mvc.service.CustomersService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomersServiceImpl implements CustomersService {
    private final CustomersDao customersDao;

    @Override
    public void save(Customers customers) {
        customersDao.save(customers);
    }

    @Override
    public void update(Customers customers) {
        customersDao.update(customers);

    }

    @Override
    public void delete(Integer id) {
        customersDao.delete(id);

    }

    @Override
    public Customers findById(Integer id) {
        return customersDao.findById(id);
    }

    @Override
    public List<Customers> findAll() {
        return customersDao.findAll();
    }

    @Override
    public List<Customers> findByName(String name) {
        return customersDao.findByName(name);
    }
}
