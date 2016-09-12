package core.repository.impl;

import core.domain.Donation;
import core.repository.api.DonationRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

import java.util.List;

public class DonationRepositoryImpl implements DonationRepository {

    private EntityManager entityManager;

	@Override
	public Donation getDonationById(final long donationId) {
		 return entityManager.find(Donation.class, donationId);
	}

	@Override
	public List<Donation> getDonationListByUser(final long userId) {
		TypedQuery<Donation> query = entityManager.createNamedQuery("findTodosByUser", Donation.class);
        query.setParameter(1, userId);
        return query.getResultList();
	}

	@Override
	public Donation create(Donation don) {
		entityManager.persist(don);
        return don;
	}

	@Override
	public Donation update(Donation don) {
		return entityManager.merge(don);
	}

	@Override
	public void remove(Donation don) {
		Donation d = entityManager.find(Donation.class, don.getId());
        entityManager.remove(d);
	}

	
}
