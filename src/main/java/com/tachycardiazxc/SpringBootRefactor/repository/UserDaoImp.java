package com.tachycardiazxc.SpringBootRefactor.repository;

import com.tachycardiazxc.SpringBootRefactor.model.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class UserDaoImp implements UserDao {

    private EntityManager entityManager;

    @PersistenceContext
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void add(User user) {
        entityManager.persist(user);

    }

    @Override
    @Transactional
    public void delete(long id) {
        User user = getById(id);
        entityManager.remove(user);
    }

    @Override
    @Transactional
    public void patch(User user) {
        entityManager.merge(user);
    }

    @Override
    public List<User> get() {
        TypedQuery<User> query = entityManager.createQuery("from User", User.class);
        return query.getResultList();
    }

    @Override
    public User getById(long id) {
        return entityManager.find(User.class, id);
    }
}
