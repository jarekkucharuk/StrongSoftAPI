package pl.StrongSoft.data.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.StrongSoft.data.domain.PracownikAdres;

@Repository
public interface PracownikAdresRepository extends JpaRepository<PracownikAdres, Integer>{

}
