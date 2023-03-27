package ku.kinkao.repository;

import ku.kinkao.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User,UUID> {

    // SELECT * FROM User WHERE username = ‘username’
    User findByUsername(String username);

}
