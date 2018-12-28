package pl.StrongSoft.data.jpa.dto;

import lombok.Data;

@Data
public class PracownikAdresDTO {

    private Integer pracownikAdresId;
    private String ulica;
    private String nrDomu;
    private String nrMieszkania;
    private String kodPocztowy;
    private String miasto;
    private String panstwo;

}
