package core.service.impl;
import core.domain.User;
import core.repository.api.UserRepository;
import core.service.api.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

public class UserServiceImpl {

	private UserRepository userRepository;
	 
	public User create(final User user) {
        return userRepository.create(user);
    } 
	
	public User update(User user) {
        return userRepository.update(user);
    }
	
	public void remove(final User user) {
        userRepository.remove(user);
    }
	
	public User getUserByEmail(final String email) {
       return userRepository.getUserByEmail(email);
    }
	
	public boolean login(final String email, final String password) {
        return userRepository.login(email, password);
    }

}
