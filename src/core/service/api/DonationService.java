package core.service.api;

import core.domain.Donation;
import java.util.List;

public interface DonationService {

	Donation getDonationById(final long donationId);
	
	List<Donation> getDonationListByUser(final long userId);
	 
	Donation update(Donation don);
	 
	Donation create(final Donation don);
	 
	void remove(final Donation don);
	 
	

}
