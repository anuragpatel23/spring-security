package com.practice.security.services;

import com.practice.security.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    List<User> userList= new ArrayList<>();

    public UserService(){
        userList.add(new User("Anurag1", "abc","anu1@gmail.com"));
        userList.add(new User("Anurag2", "abc","anu2@gmail.com"));
        userList.add(new User("Anurag3", "abc","anu3@gmail.com"));
        userList.add(new User("Anurag4", "abc","anu4@gmail.com"));
        userList.add(new User("Anurag5", "abc","anu5@gmail.com"));
        userList.add(new User("Anurag6", "abc","anu6@gmail.com"));
        userList.add(new User("Anurag7", "abc","anu7@gmail.com"));
        userList.add(new User("Anurag8", "abc","anu8@gmail.com"));
    }

    public List<User> getAllUsers(){
        return this.userList;
    }

    public User getUser(String userName){
        return this.userList.stream().filter(user -> user.getUserName().equals(userName)).findAny().orElse(null);
    }

    public User addUser(User user){
        this.userList.add(user);
        return user;
    }
}
