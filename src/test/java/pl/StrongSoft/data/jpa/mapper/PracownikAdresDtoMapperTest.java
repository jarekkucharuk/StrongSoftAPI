package pl.StrongSoft.data.jpa.mapper;

import org.junit.Assert;
import org.junit.Test;
import pl.StrongSoft.data.jpa.domain.entities.PracownikAdres;
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

        Assert.assertEquals(pracownikAdresDTO.getPracownikAdresId(), Integer.valueOf(1));
        Assert.assertEquals(pracownikAdresDTO.getKodPocztowy(), "00-000");
        Assert.assertEquals(pracownikAdresDTO.getMiasto(), "Kraków");
        Assert.assertEquals(pracownikAdresDTO.getNrDomu(), "897");
        Assert.assertEquals(pracownikAdresDTO.getNrMieszkania(), "345");
        Assert.assertEquals(pracownikAdresDTO.getUlica(), "Lipowa");
        Assert.assertEquals(pracownikAdresDTO.getPanstwo(), "RPA");

    }
}