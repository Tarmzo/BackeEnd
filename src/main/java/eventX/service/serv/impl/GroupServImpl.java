package eventX.service.serv.impl;

import eventX.domain.Group;
import eventX.repository.GroupRepository;
import eventX.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;

public class GroupServImpl implements GroupService{

    @Autowired
    private GroupRepository repository;

    @Override
    public Group create(Group entity) {
        return repository.save(entity);
    }

    @Override
    public Group readById(Long aLong) {
        return repository.findOne(aLong);
    }

    @Override
    public Iterable<Group> readAll() {
        Iterable<Group> activities = repository.findAll();
        return activities;
    }

    @Override
    public Group update(Group entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(Group entity) {
        repository.delete(entity);
    }
}
