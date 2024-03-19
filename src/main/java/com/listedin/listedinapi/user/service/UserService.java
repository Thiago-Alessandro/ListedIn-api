package com.listedin.listedinapi.user.service;

import com.listedin.listedinapi.user.model.entity.User;
import com.listedin.listedinapi.user.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User findById(Long id){
        return userRepository.findById(id).get();
    }

    public Collection<User> findAll(){
        return userRepository.findAll();
    }

    public User create(User user){
        return userRepository.save(user);
    }

    public User update(User user){
        return userRepository.save(user);
    }

    public void delete(Long id){
        userRepository.deleteById(id);
    }

}
