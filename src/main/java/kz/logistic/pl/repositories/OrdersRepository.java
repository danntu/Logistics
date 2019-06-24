package kz.logistic.pl.repositories;

import kz.logistic.pl.models.entities.OrdersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface
OrdersRepository extends JpaRepository<OrdersEntity, Long> {

}
