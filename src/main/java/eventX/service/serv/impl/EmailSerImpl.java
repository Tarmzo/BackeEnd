package eventX.service.serv.impl;

import eventX.domain.EmailAddress;
import eventX.repository.EmailAddressRepository;
import eventX.service.EmailRepoService;
import org.springframework.beans.factory.annotation.Autowired;

public class EmailSerImpl implements EmailRepoService {
    @Autowired
    private EmailAddressRepository repository;

    @Override
    public EmailAddress create(EmailAddress entity) {
        return repository.save(entity);
    }

    @Override
    public EmailAddress readById(Long aLong) {
        return repository.findOne(aLong);
    }

    @Override
    public Iterable<EmailAddress> readAll() {
        Iterable<EmailAddress> activities = repository.findAll();
        return activities;
    }

    @Override
    public EmailAddress update(EmailAddress entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(EmailAddress entity) {
        repository.delete(entity);
    }
}
