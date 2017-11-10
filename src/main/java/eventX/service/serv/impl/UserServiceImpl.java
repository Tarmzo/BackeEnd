package eventX.service.serv.impl;

import eventX.domain.User;
import eventX.repository.UsersRepository;
import eventX.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UsersRepository repository;

    @Override
    public String getRole(String email) {
        return repository.getUserRole(email);
    }

    @Override
    public boolean checkUser(String login, String pswd) {
        return repository.checkUser(login,pswd);
    }

    @Override
    public User getUser(String name, String surname) {
        return repository.getUser(name,surname);
    }

    @Override
    public void addUser(User user) {
        repository.save(user);
    }
}
