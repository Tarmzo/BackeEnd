package eventX.repository;

import eventX.domain.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository {
    String getUserRole(String email);
    boolean checkUser(String login, String pass);
    User getUser(String name, String surname);
    void save(User user);
}
