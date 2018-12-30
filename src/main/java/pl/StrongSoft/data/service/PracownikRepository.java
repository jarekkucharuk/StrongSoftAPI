package pl.StrongSoft.data.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.StrongSoft.data.jpa.domain.entities.Pracownik;

@Repository
public interface PracownikRepository extends JpaRepository<Pracownik, Integer> {


}
