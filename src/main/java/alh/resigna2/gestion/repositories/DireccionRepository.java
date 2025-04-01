package alh.resigna2.gestion.repositories;

import alh.resigna2.gestion.entities.Direccion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface DireccionRepository extends JpaRepository<Direccion, Long> {
}
