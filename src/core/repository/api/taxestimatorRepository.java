package core.repository.api;
import core.domain.Donation;
import java.util.List;

public interface taxestimatorRepository {

	Donation getDonationById(final long did);
	
	List<Donation> getDonationListByUser(final long userId);
	
	Donation create(final Donation don);
	
	Donation update(Donation don);
	
	void remove(final Donation don);
	

}
