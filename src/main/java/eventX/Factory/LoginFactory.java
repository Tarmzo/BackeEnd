package eventX.Factory;

import eventX.domain.Login;

import java.util.Map;

/**
 * Created by SQIM-User on 2017/10/07.
 */
public class LoginFactory {
    public static Login getLogin(Map<String, String> values) {
        Login login = new Login.Builder()
                .ID(values.get("id"))
                .username(values.get("username"))
                .password(values.get("password"))
                .build();
        return login;
    }
}
