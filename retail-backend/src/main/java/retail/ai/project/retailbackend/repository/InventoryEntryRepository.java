package retail.ai.project.retailbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import retail.ai.project.retailbackend.model.InventoryEntry;

public interface InventoryEntryRepository extends JpaRepository<InventoryEntry, Long> {
}
