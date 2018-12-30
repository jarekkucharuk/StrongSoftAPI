package pl.StrongSoft.data.jpa.mapper;

import org.springframework.stereotype.Component;
import pl.StrongSoft.data.jpa.domain.entities.Pracownik;
import pl.StrongSoft.data.jpa.dto.PracownikDTO;

@Component
public class PracownikMapper {

    public Pracownik mapFromDTO (Pracownik pracownik,PracownikDTO pracownikDTO){

        pracownik.setPracownikId(pracownikDTO.getPracownikId());
        pracownik.setEmail(pracownikDTO.getEmail());
        pracownik.setImie(pracownikDTO.getImie());
        pracownik.setNazwisko(pracownikDTO.getNazwisko());

        return pracownik;
    }
}
