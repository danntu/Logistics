package kz.logistic.pl.repositories;

import kz.logistic.pl.models.entities.LoginEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoginRepository extends JpaRepository<LoginEntity, Long> {
    List<LoginEntity> findByCustomerEntityCustomerIdIsNotNull();
}
