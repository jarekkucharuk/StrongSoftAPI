package pl.StrongSoft.data.jpa.mapper;

import org.springframework.stereotype.Component;
import pl.StrongSoft.data.jpa.domain.PracownikAdres;
import pl.StrongSoft.data.jpa.dto.PracownikAdresDTO;

@Component
public class PracownikAdresDtoMapper {

    public PracownikAdresDTO mapToDTO (PracownikAdresDTO pracownikAdresDTO, PracownikAdres pracownikAdres){

        pracownikAdresDTO.setPracownikAdresId(pracownikAdres.getPracownikAdresId());
        pracownikAdresDTO.setKodPocztowy(pracownikAdres.getKodPocztowy());
        pracownikAdresDTO.setMiasto(pracownikAdres.getMiasto());
        pracownikAdresDTO.setNrDomu(pracownikAdres.getNrDomu());
        pracownikAdresDTO.setNrMieszkania(pracownikAdres.getNrMieszkania());
        pracownikAdresDTO.setUlica(pracownikAdres.getUlica());
        pracownikAdresDTO.setPanstwo(pracownikAdres.getPanstwo());

        return pracownikAdresDTO;
    }
}
