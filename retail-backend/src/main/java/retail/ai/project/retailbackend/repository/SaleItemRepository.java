package retail.ai.project.retailbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import retail.ai.project.retailbackend.model.SaleItem;

public interface SaleItemRepository extends JpaRepository<SaleItem, Long> {
}
