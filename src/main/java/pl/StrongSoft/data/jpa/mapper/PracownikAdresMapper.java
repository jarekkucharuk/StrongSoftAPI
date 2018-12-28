package pl.StrongSoft.data.jpa.mapper;

import org.springframework.stereotype.Component;
import pl.StrongSoft.data.jpa.domain.PracownikAdres;
import pl.StrongSoft.data.jpa.dto.PracownikDTO;

@Component
public class PracownikAdresMapper {

    public PracownikAdres mapFromDTO (PracownikAdres pracownikAdres, PracownikDTO pracownikDTO){

        pracownikAdres.setPracownikAdresId(pracownikDTO.getPracownikAdresDTO().getPracownikAdresId());
        pracownikAdres.setKodPocztowy(pracownikDTO.getPracownikAdresDTO().getKodPocztowy());
        pracownikAdres.setMiasto(pracownikDTO.getPracownikAdresDTO().getMiasto());
        pracownikAdres.setNrDomu(pracownikDTO.getPracownikAdresDTO().getNrDomu());
        pracownikAdres.setNrMieszkania(pracownikDTO.getPracownikAdresDTO().getNrMieszkania());
        pracownikAdres.setUlica(pracownikDTO.getPracownikAdresDTO().getUlica());
        pracownikAdres.setPanstwo(pracownikDTO.getPracownikAdresDTO().getPanstwo());

        return pracownikAdres;
    }

}
