package eventX.service.serv.impl;

import eventX.domain.Activity;
import eventX.repository.ActivityRepository;
import eventX.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;

public class ActivityServiceImpl implements ActivityService {
    @Autowired
    private ActivityRepository repository;

    @Override
    public Activity create(Activity entity) {
        return repository.save(entity);
    }

    @Override
    public Activity readById(Long aLong) {
        return repository.findOne(aLong);
    }

    @Override
    public Iterable<Activity> readAll() {
        Iterable<Activity> activities = repository.findAll();
        return activities;
    }

    @Override
    public Activity update(Activity entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(Activity entity) {
        repository.delete(entity);
    }
}
