package core.repository.impl;

import core.domain.User;
import core.repository.api.UserRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

import core.domain.User;
import core.repository.api.UserRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;


public class UserRepositoryImpl implements UserRepository {

	private EntityManager entityManager;
	
	@Override
	public User getUserByEmail(String email) {
		TypedQuery<User> query = entityManager.createNamedQuery("findUserByEmail", User.class);
        query.setParameter("p_email", email);
        List<User> users = query.getResultList();
        return (users != null && !users.isEmpty()) ? users.get(0) : null;
	}

	@Override
	public boolean login(final String email, final String password) {
        TypedQuery<User> query = entityManager.createNamedQuery("findUserByEmailAndPassword", User.class);
        query.setParameter("p_email", email);
        query.setParameter("p_password", password);
        List<User> users = query.getResultList();
        return (users != null && !users.isEmpty());
    }

	@Override
	public User create(User user) {
		entityManager.merge(user);
		return user;
	}

	@Override
	public User update(User user) {
		return entityManager.merge(user);
	}

	@Override
	public void remove(User user) {
		entityManager.createNativeQuery("DELETE FROM Donation d WHERE d.userId = " + user.getId()).executeUpdate();
        User u = entityManager.find(User.class, user.getId());
        entityManager.remove(u);		
	}

}
