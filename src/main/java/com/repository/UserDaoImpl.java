package com.repository;

import com.entity.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Component
@Transactional
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    EntityManager em;


    public UserDaoImpl() {}

    public void addUser(String name, String lastName, String email) {
        em.persist(new User(name, lastName, email));
    }

    public void updateUser(User user) {
        if (em.createQuery("from User u where u.id = " + user.getId(), User.class).getResultList().size() != 0) {
            em.merge(user);
        }
    }

    @SuppressWarnings("unchecked")
    public List<User> readUsers() {
        return em.createQuery("from User").getResultList();
    }


    public void deleteUsersById(long id) {
        try {
            em.remove(em.find(User.class, id));
        } catch(Exception ignore) {}
    }
}
