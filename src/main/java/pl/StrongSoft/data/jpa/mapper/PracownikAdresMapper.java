package pl.StrongSoft.data.jpa.mapper;

import org.springframework.stereotype.Component;
import pl.StrongSoft.data.jpa.domain.entities.PracownikAdres;
import pl.StrongSoft.data.jpa.dto.PracownikAdresDTO;

@Component
public class PracownikAdresMapper {

    public PracownikAdres mapFromDTO (PracownikAdres pracownikAdres, PracownikAdresDTO pracownikAdresDTO){

        pracownikAdres.setPracownikAdresId(pracownikAdresDTO.getPracownikAdresId());
        pracownikAdres.setKodPocztowy(pracownikAdresDTO.getKodPocztowy());
        pracownikAdres.setMiasto(pracownikAdresDTO.getMiasto());
        pracownikAdres.setNrDomu(pracownikAdresDTO.getNrDomu());
        pracownikAdres.setNrMieszkania(pracownikAdresDTO.getNrMieszkania());
        pracownikAdres.setUlica(pracownikAdresDTO.getUlica());
        pracownikAdres.setPanstwo(pracownikAdresDTO.getPanstwo());

        return pracownikAdres;
    }

}
