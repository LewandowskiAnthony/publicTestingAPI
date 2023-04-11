package com.lewandowski.api.publicapitester.services;

import com.lewandowski.api.publicapitester.models.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class UserService implements CommandLineRunner {

    private final List<User> userList = new ArrayList<>();

    @Override
    public void run(String... args) throws Exception {
        userList.add(new User(1, "Anthony", "Lewandowski"));
        userList.add(new User(2, "Jean", "Valjean"));
        userList.add(new User(3, "Michel", "Polnareff"));
    }

    public List<User> getUserList(){
        return userList;
    }

    public Optional<User> getUser(Integer id){
        return userList.stream().filter(user -> user.getId().equals(id)).toList().stream().findFirst();
    }
}
