package core.service.impl;

import core.domain.Donation;
import core.repository.api.DonationRepository;
import core.service.api.DonationService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

public class DonationServiceImpl implements DonationService {

	private DonationRepository donationRepository;
	

	@Override
	public Donation getDonationById(long donationId) {
		return donationRepository.getDonationById(donationId);
	}

	@Override
	public List<Donation> getDonationListByUser(long userId) {
		return donationRepository.getDonationListByUser(userId);
	}

	@Override
	public Donation update(Donation don) {
		return donationRepository.update(don);
	}

	@Override
	public Donation create(Donation don) {
		return donationRepository.create(don);
	}

	@Override
	public void remove(Donation don) {
		donationRepository.remove(don);
		
	}

}
