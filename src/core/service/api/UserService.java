package core.service.api;

import core.domain.User;

public interface UserService {

	User getUserByEmail(final String email);
	
	boolean login(final String email, final String password);
	
	User create(final User user);
	
	User update(User user);
	
	void remove(final User user);
}
