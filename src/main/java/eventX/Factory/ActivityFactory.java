package eventX.Factory;

import eventX.domain.Activity;

import java.util.Map;

/**
 * Created by SQIM-User on 2017/08/14.
 */
public class ActivityFactory {

    public static Activity getActivity(Map<String, String> values, int age){
        Activity activity = new Activity.Builder()
                .points(26)
                .name(values.get("name"))
                .activityDescription(values.get("activityDescription"))
                .id(values.get("id"))
                .build();
        return activity;
    }
}
