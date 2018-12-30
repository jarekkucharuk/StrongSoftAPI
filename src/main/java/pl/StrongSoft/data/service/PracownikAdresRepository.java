package pl.StrongSoft.data.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.StrongSoft.data.jpa.domain.entities.PracownikAdres;

@Repository
public interface PracownikAdresRepository extends JpaRepository<PracownikAdres, Integer>{


}
