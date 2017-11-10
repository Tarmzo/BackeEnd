package eventX.Factory;

import eventX.domain.Group;

import java.util.Map;

/**
 * Created by SQIM-User on 2017/08/14.
 */
public class GroupFactory {
    public static Group getEmailAddress(Map<String, String> values) {
        Group emailAddress = new Group.Builder()
                .ID(values.get("id"))
                .name(values.get("name"))
                .gDescription(values.get("groupDescription"))
                .manager(values.get("manager"))
                .build();
        return emailAddress;
    }
}
