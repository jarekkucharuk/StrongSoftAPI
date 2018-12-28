package pl.StrongSoft.data.jpa.dto;

import lombok.Data;

@Data
public class PracownikDTO {

    private Integer pracownikId;
    private String imie;
    private String nazwisko;
    private String email;
    private PracownikAdresDTO pracownikAdresDTO;

}
