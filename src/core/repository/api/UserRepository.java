package core.repository.api;
import core.domain.Donation;
import core.domain.User;

public interface UserRepository {

	User getUserByEmail(final String email);
	
	boolean login(final String email, final String password);
	
	User create(final User user);
	
	User update(User user);
	
	void remove(final User user);

}
