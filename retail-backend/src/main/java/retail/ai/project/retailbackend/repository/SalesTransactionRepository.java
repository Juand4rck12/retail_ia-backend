package retail.ai.project.retailbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import retail.ai.project.retailbackend.model.SalesTransaction;

public interface SalesTransactionRepository extends JpaRepository<SalesTransaction, Long> {
}
