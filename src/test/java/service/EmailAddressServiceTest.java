package service;


/**
 * Created by SQIM-User on 2017/08/14.
 */

import eventX.Factory.ActivityFactory;
import eventX.Factory.EmailAddressFactory;
import eventX.domain.Activity;
import eventX.domain.EmailAddress;
import eventX.repository.EmailAddressRepository;
import eventX.service.ActivityService;
import eventX.service.EmailRepoService;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class EmailAddressServiceTest {/*
    EmailRepoService service;


    @Test
    public void create()  throws Exception {

    }

    @Test(dependsOnMethods = "create")
    public void read() throws Exception {
        EmailAddress readEmailAddress = service.read("1");

    }

    @Test
    public void update() throws Exception {
        EmailAddress emailAddress = service.read("1");
        EmailAddress newEmailAddress = new EmailAddress();
        service.update(newEmailAddress);
        EmailAddress newEmailAddress1 = service.read("1");
    }

    @Test (dependsOnMethods = "update")
    public void delete() throws Exception {
        service.delete("1");
        EmailAddress emailAddress = service.read("1");
        Assert.assertNull(emailAddress);
    } */
}