package retail.ai.project.retailbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import retail.ai.project.retailbackend.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
