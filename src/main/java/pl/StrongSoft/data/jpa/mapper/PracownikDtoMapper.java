package pl.StrongSoft.data.jpa.mapper;

import org.springframework.stereotype.Component;
import pl.StrongSoft.data.jpa.domain.entities.Pracownik;
import pl.StrongSoft.data.jpa.dto.PracownikDTO;

@Component
public class PracownikDtoMapper {

    public PracownikDTO mapToDTO (PracownikDTO pracownikDTO, Pracownik pracownik){

        pracownikDTO.setPracownikId(pracownik.getPracownikId());
        pracownikDTO.setEmail(pracownik.getEmail());
        pracownikDTO.setImie(pracownik.getImie());
        pracownikDTO.setNazwisko(pracownik.getNazwisko());

        return pracownikDTO;
    }

}
