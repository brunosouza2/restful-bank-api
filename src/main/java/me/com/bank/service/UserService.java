package me.com.bank.service;

import jakarta.persistence.EntityExistsException;
import me.com.bank.domain.model.User;
import me.com.bank.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(NoSuchElementException::new);
    }
    
    public User create(User user) {
        boolean isUserExistent = userRepository.findById(user.getId()).isPresent();
        if (isUserExistent) {
            throw new EntityExistsException();
        }
        return userRepository.save(user);
    }
    
    
}
