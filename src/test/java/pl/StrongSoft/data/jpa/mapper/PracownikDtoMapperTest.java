package pl.StrongSoft.data.jpa.mapper;

import org.junit.Assert;
import org.junit.Test;
import pl.StrongSoft.data.jpa.domain.entities.Pracownik;
import pl.StrongSoft.data.jpa.dto.PracownikDTO;

public class PracownikDtoMapperTest {

    PracownikDtoMapper pracownikDtoMapper = new PracownikDtoMapper();

    @Test
    public void mapToDTO() throws Exception {

        Pracownik pracownik = new Pracownik();
        pracownik.setPracownikId(13);
        pracownik.setEmail("baranowski@gmail.com");
        pracownik.setImie("Waldemar");
        pracownik.setNazwisko("Kowalski");

        PracownikDTO pracownikDTO =  pracownikDtoMapper.mapToDTO(new PracownikDTO(), pracownik);

        Assert.assertEquals(pracownikDTO.getPracownikId(), Integer.valueOf(13));
        Assert.assertEquals(pracownikDTO.getEmail(), "baranowski@gmail.com");
        Assert.assertEquals(pracownikDTO.getImie(), "Waldemar");
        Assert.assertEquals(pracownikDTO.getNazwisko(), "Kowalski");
    }

}