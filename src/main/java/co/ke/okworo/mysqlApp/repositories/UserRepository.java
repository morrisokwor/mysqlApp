package co.ke.okworo.mysqlApp.repositories;

import co.ke.okworo.mysqlApp.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users,Long> {
    boolean existsByEmail(String email);
}
