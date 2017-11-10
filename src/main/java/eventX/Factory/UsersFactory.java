package eventX.Factory;

import eventX.domain.User;

import java.util.Map;

public class UsersFactory {
    public static User getReservation(Map<String, Object> values) {
        User userFact = new User.Builder()
                .ID((String) values.get("id"))
                .username((String) values.get("username"))
                .surname((String) values.get("surname"))
                .email((String) values.get("email"))
                .build();
        return userFact;
    }
}
