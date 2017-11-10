package service;

import eventX.Factory.GroupFactory;
import eventX.domain.Group;
import eventX.repository.GroupRepository;
import org.springframework.util.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class GroupServiceTest {/*
    Map<String,String> values;
    GroupRepository repository;

    @BeforeClass
    public void setUp() throws Exception {
        values = new HashMap<String, String>();
        values.put("id","1");
        values.put("name","Daily Stand Up");
        values.put("activityDescription","Stand up Meeting");
    }

    @Test
    public void create()  throws Exception {
        //toDO
    }

    @Test(dependsOnMethods = "create")
    public void read() throws Exception {
        Group readActivity = repository.read("1");
        org.testng.Assert.assertEquals("name",readActivity.getName());
    }

    @Test(dependsOnMethods = "read")
    public void update() throws Exception {
       ////toDO
    }

    @Test (dependsOnMethods = "update")
    public void delete() throws Exception {
        repository.delete("1");
        Group gp = repository.read("1");
        org.testng.Assert.assertNull(gp);
    } */}
