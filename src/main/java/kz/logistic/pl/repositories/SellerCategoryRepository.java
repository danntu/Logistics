package kz.logistic.pl.repositories;

import kz.logistic.pl.models.entities.SellerCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellerCategoryRepository extends JpaRepository<SellerCategory, Long> {
}
