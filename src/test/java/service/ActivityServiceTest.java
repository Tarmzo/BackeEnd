package service;


/**
 * Created by SQIM-User on 2017/08/14.
 */

import eventX.Factory.ActivityFactory;
import eventX.domain.Activity;
import eventX.repository.ActivityRepository;
import eventX.service.ActivityService;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class ActivityServiceTest {
    /*
    ActivityService service;
    Map<String,String> values;

    @BeforeClass
    public void setUp() throws Exception {
        values = new HashMap<String, String>();
        values.put("id","1");
        values.put("name","Daily Stand Up");
        values.put("activityDescription","Stand up Meeting");
    }

    @Test
    public void testCreate()  throws Exception {
        Activity activity = ActivityFactory.getActivity(values,25);
        service.create(activity);
        Assert.assertEquals("activityDescription",activity.getActivityDescription());
    }

    @Test(dependsOnMethods = "testCreate")
    public void testRead() throws Exception {
        Activity readActivity = service.read("1");
        Assert.assertEquals("name",readActivity.getName());
    }

    @Test
    public void testUpdate() throws Exception {
        Activity activity = service.create("1");
        Activity newActivity = new Activity.Builder()
                .points(50)
                .name(values.get("name7"))
                .activityDescription(values.get("activity-Description"))
                .id(values.get("id"))
                .build();
        service.update(newActivity);
        Activity UpdateActivity = service.create(newActivity);
        Assert.assertEquals(50,UpdateActivity.getPoints());
    }

    @Test
    public void delete() throws Exception {
        service.delete(Activity e);
        Activity activity = service.create(1);
        Assert.assertNull(activity);
    }*/}