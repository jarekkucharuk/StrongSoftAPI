package pl.StrongSoft.data.jpa.mapper;

import org.junit.Assert;
import org.junit.Test;
import pl.StrongSoft.data.jpa.domain.entities.Pracownik;
import pl.StrongSoft.data.jpa.dto.PracownikDTO;

public class PracownikMapperTest {

    PracownikMapper pracownikMapper = new PracownikMapper();

        @Test
    public void mapFromDTO() throws Exception {

            PracownikDTO pracownikDTO = new PracownikDTO();
            pracownikDTO.setPracownikId(3);
            pracownikDTO.setEmail("walery@op.pl");
            pracownikDTO.setImie("Karol");
            pracownikDTO.setNazwisko("Nowacki");

            Pracownik pracownik =  pracownikMapper.mapFromDTO(new Pracownik(), pracownikDTO);

            Assert.assertEquals(pracownik.getPracownikId(), Integer.valueOf(3));
            Assert.assertEquals(pracownik.getEmail(), "walery@op.pl");
            Assert.assertEquals(pracownik.getImie(), "Karol");
            Assert.assertEquals(pracownik.getNazwisko(), "Nowacki");
    }

}