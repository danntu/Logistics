package kz.logistic.pl.repositories;

import kz.logistic.pl.models.entities.WarehouseAddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WarehouseAddressRepository extends JpaRepository<WarehouseAddressEntity, Long> {
}