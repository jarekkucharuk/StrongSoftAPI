package pl.StrongSoft.jpa.dto;

import lombok.Data;
import pl.StrongSoft.data.domain.PracownikAdres;

@Data
public class PracownikDTO {

    private Integer pracownikId;
    private String imie;
    private String nazwisko;
    private String email;
    private PracownikAdres pracownikAdres;

}
