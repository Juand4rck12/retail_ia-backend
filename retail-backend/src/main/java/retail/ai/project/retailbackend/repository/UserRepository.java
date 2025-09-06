package retail.ai.project.retailbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import retail.ai.project.retailbackend.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
