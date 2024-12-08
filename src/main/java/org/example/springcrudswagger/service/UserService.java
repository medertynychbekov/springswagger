package org.example.springcrudswagger.service;

import lombok.RequiredArgsConstructor;
import org.example.springcrudswagger.model.entity.User;
import org.example.springcrudswagger.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User save(User user) {
        return userRepository.save(user);
    }

    public User findById(Long id) {
        return userRepository.findById(id).get();
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User updateById(Long id, User user) {
        User oldUser = findById(id);

        oldUser.setName(user.getName());
        oldUser.setAge(user.getAge());

        return userRepository.save(oldUser);
    }

    public void deleteById(Long id){
        userRepository.deleteById(id);
    }
}
