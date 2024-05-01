package aze.coders.spring.mvc.dao.impl;

import aze.coders.spring.mvc.dao.CustomersDao;
import aze.coders.spring.mvc.entity.Customers;
import lombok.RequiredArgsConstructor;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@RequiredArgsConstructor
@Transactional
public class CustomersDaoImpl implements CustomersDao {
    private final SessionFactory sessionFactory;

    @Override
    public void save(Customers customers) {
        sessionFactory.getCurrentSession().persist(customers);
    }

    @Override
    public void update(Customers customers) {
        sessionFactory.getCurrentSession().merge(customers);
    }

    @Override
    public void delete(Integer id) {
        sessionFactory.getCurrentSession().remove(findById(id));
    }

    @Override
    public Customers findById(Integer id) {
        return sessionFactory.getCurrentSession().get(Customers.class, id);
    }

    @Override
    public List<Customers> findAll() {
        return sessionFactory.getCurrentSession().createQuery("select c from Customers c").list();
    }

    @Override
    public List<Customers> findByName(String name) {
        return sessionFactory.getCurrentSession().createQuery("select c from Customers c where c.name=:name ")
                .setParameter("name", name).list();
    }
}
