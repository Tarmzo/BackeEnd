package eventX.service.serv.impl;

import eventX.domain.Login;
import eventX.repository.LoginRepository;
import eventX.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;

public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginRepository repository;

    @Override
    public Login create(Login entity) {
        return repository.save(entity);
    }

    @Override
    public Login readById(Long aLong) {
        return repository.findOne(aLong);
    }

    @Override
    public Iterable<Login> readAll() {
        Iterable<Login> activities = repository.findAll();
        return activities;
    }

    @Override
    public Login update(Login entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(Login entity) {
        repository.delete(entity);
    }
}
