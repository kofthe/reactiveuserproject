package kofthe.reactiveuserproject.service;

import kofthe.reactiveuserproject.model.User;
import kofthe.reactiveuserproject.repository.DepartmentRepository;
import kofthe.reactiveuserproject.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@Slf4j
@Transactional
public class UserService {

    private final UserRepository userRepository;
    private final DepartmentRepository departmentRepository;

    public UserService(UserRepository userRepository, DepartmentRepository departmentRepository) {
        this.userRepository = userRepository;
        this.departmentRepository = departmentRepository;
    }

    public Mono<User> createUser(User user) {
        return userRepository.save(user);
    }

    public Flux<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Mono<User> getUserById(int id) {
        return userRepository.findById(id);
    }

    public Mono<User> updateUser(int id, User user) {
        return userRepository.findById(id)
                .flatMap(dbUser ->{
                    dbUser.setAge(user.getAge());
                    dbUser.setSalary(user.getSalary());
                    return userRepository.save(dbUser);
                });

    }

    public Mono<User> deleteUser(int id) {
        return userRepository.findById(id)
                .flatMap(existingUser -> userRepository.delete(existingUser)
                .then(Mono.just(existingUser)));
    }

    public Flux<User> findUsersByAge(int age){
        return userRepository.findByAge(age);
    }

}
