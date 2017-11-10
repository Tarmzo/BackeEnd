package eventX.repository;

import eventX.domain.Login;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by SQIM-User on 2017/10/07.
 */
public interface LoginRepository extends CrudRepository<Login,Long> {
}
