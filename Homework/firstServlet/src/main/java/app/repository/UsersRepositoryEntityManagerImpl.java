package app.repository;

import app.entities.User2;

import javax.persistence.EntityManager;
import java.util.List;

public class UsersRepositoryEntityManagerImpl implements UsersRepository {

    private EntityManager entityManager;

    public UsersRepositoryEntityManagerImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<User2> findAll() {
        return entityManager
                .createQuery("from User2 user order by user.id", User2.class)
                .getResultList();
    }

    @Override
    public void save(User2 model) {
        entityManager.getTransaction().begin();
        entityManager.persist(model);
        entityManager.getTransaction().commit();
    }
}