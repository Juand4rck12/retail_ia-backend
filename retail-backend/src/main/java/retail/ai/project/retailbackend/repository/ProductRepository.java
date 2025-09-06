package retail.ai.project.retailbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import retail.ai.project.retailbackend.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
