package retail.ai.project.retailbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import retail.ai.project.retailbackend.model.Supplier;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {
}
