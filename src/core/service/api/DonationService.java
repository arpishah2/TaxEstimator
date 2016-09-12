package core.service.api;

import core.domain.Donation;
import java.util.List;

public interface DonationService {

	Donation getDonationById(final long donationId);
	
	List<Donation> getDonationListByUser(final long userId);
	
	List<Donation> getDonationListByUserAndYear(final long userId, final int year);
	 
	Donation update(Donation don);
	 
	Donation create(final Donation don);
	 
	void remove(final Donation don);
	 
}
