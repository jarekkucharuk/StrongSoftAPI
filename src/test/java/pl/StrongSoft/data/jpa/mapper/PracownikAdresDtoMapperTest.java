package pl.StrongSoft.data.jpa.mapper;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import pl.StrongSoft.data.jpa.domain.PracownikAdres;
import pl.StrongSoft.data.jpa.dto.PracownikAdresDTO;

public class PracownikAdresDtoMapperTest {

    PracownikAdresDtoMapper pracownikAdresDtoMapper = new PracownikAdresDtoMapper();

    @Test
    public void mapToDTO() throws Exception {
        PracownikAdres pracownikAdres= new PracownikAdres();
        pracownikAdres.setPracownikAdresId(1);
        pracownikAdres.setKodPocztowy("00-000");
        pracownikAdres.setMiasto("Kraków");
        pracownikAdres.setNrDomu("897");
        pracownikAdres.setNrMieszkania("345");
        pracownikAdres.setUlica("Lipowa");
        pracownikAdres.setPanstwo("RPA");

        PracownikAdresDTO pracownikAdresDTO =  pracownikAdresDtoMapper.mapToDTO(new PracownikAdresDTO(), pracownikAdres);

        Assert.assertEquals(pracownikAdresDTO.getKodPocztowy(), "00-000");
    }

}