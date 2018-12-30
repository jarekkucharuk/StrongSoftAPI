package pl.StrongSoft.data.jpa.mapper;

import org.junit.Assert;
import org.junit.Test;
import pl.StrongSoft.data.jpa.domain.entities.PracownikAdres;
import pl.StrongSoft.data.jpa.dto.PracownikAdresDTO;

public class PracownikAdresMapperTest {

    PracownikAdresMapper pracownikAdresMapper = new PracownikAdresMapper();

    @Test
    public void mapFromDTO() throws Exception {

        PracownikAdresDTO pracownikAdresDTO = new PracownikAdresDTO();
        pracownikAdresDTO.setPracownikAdresId(1);
        pracownikAdresDTO.setKodPocztowy("00-000");
        pracownikAdresDTO.setMiasto("Kraków");
        pracownikAdresDTO.setNrDomu("897");
        pracownikAdresDTO.setNrMieszkania("345");
        pracownikAdresDTO.setUlica("Lipowa");
        pracownikAdresDTO.setPanstwo("RPA");

        PracownikAdres pracownikAdres =  pracownikAdresMapper.mapFromDTO(new PracownikAdres(), pracownikAdresDTO);

        Assert.assertEquals(pracownikAdresDTO.getPracownikAdresId(), Integer.valueOf(1));
        Assert.assertEquals(pracownikAdresDTO.getKodPocztowy(), "00-000");
        Assert.assertEquals(pracownikAdresDTO.getMiasto(), "Kraków");
        Assert.assertEquals(pracownikAdresDTO.getNrDomu(), "897");
        Assert.assertEquals(pracownikAdresDTO.getNrMieszkania(), "345");
        Assert.assertEquals(pracownikAdresDTO.getUlica(), "Lipowa");
        Assert.assertEquals(pracownikAdresDTO.getPanstwo(), "RPA");
    }

}