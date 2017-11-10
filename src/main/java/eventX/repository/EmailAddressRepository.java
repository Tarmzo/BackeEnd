package eventX.repository;

import eventX.domain.EmailAddress;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by SQIM-User on 2017/08/14.
 */
public interface EmailAddressRepository extends CrudRepository<EmailAddress, Long>{
}
