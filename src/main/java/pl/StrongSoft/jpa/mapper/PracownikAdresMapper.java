package pl.StrongSoft.jpa.mapper;

import org.springframework.stereotype.Component;
import pl.StrongSoft.data.domain.PracownikAdres;
import pl.StrongSoft.jpa.dto.PracownikDTO;

@Component
public class PracownikAdresMapper {

    public PracownikAdres mapFromDTO (PracownikAdres pracownikAdres, PracownikDTO pracownikDTO){

        pracownikAdres.setPracownikAdresId(pracownikDTO.getPracownikAdres().getPracownikAdresId());
        pracownikAdres.setKodPocztowy(pracownikDTO.getPracownikAdres().getKodPocztowy());
        pracownikAdres.setMiasto(pracownikDTO.getPracownikAdres().getMiasto());
        pracownikAdres.setNrDomu(pracownikDTO.getPracownikAdres().getNrDomu());
        pracownikAdres.setNrMieszkania(pracownikDTO.getPracownikAdres().getNrMieszkania());
        pracownikAdres.setUlica(pracownikDTO.getPracownikAdres().getUlica());
        pracownikAdres.setPanstwo(pracownikDTO.getPracownikAdres().getPanstwo());

        return pracownikAdres;
    }
}
