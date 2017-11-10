package eventX.service;

import eventX.domain.User;

public interface UserService {
    String getRole(String email);
    boolean checkUser(String login, String pswd);
    User getUser(String name, String surname);
    void addUser(User user);
}
