package pl.StrongSoft.jpa.dto;

import lombok.Data;

@Data
public class ValuesDTO {

    private Long value1;
    private Long value2;

    public Long sum(Long value1, Long value2){
        return value1+value2;
    }
}
