package pl.StrongSoft.jpa.api;

import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.StrongSoft.data.domain.Pracownik;
import pl.StrongSoft.data.domain.PracownikAdres;
import pl.StrongSoft.data.service.PracownikAdresRepository;
import pl.StrongSoft.data.service.PracownikRepository;
import pl.StrongSoft.jpa.dto.PracownikDTO;
import pl.StrongSoft.jpa.dto.ValuesDTO;
import pl.StrongSoft.jpa.mapper.PracownikAdresMapper;
import pl.StrongSoft.jpa.mapper.PracownikMapper;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

@RequestMapping(value = "/pracownik")
@RestController
public class PracownikREST {

    @Autowired
    PracownikRepository pracownikRepository;
    @Autowired
    PracownikAdresRepository pracownikAdresRepository;
    @Autowired
    PracownikMapper pracownikMapper;
    @Autowired
    PracownikAdresMapper pracownikAdresMapper;

    @GetMapping("/all")
    public List<Pracownik> getPracownikList() {

        Stream<Pracownik> stream = StreamSupport.stream(pracownikRepository.findAll().spliterator(), false);

        return stream.collect(Collectors.toList());
    }

    @GetMapping("/pr/{id}")
    public Pracownik getPracownik(@PathVariable Integer id) throws NotFoundException {

        Pracownik pracownik = pracownikRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Nie ma pracownika o id= " + id));

        return pracownik;
    }

    @PostMapping
    public Long getValues(@RequestBody ValuesDTO valuesDTO) {
        return valuesDTO.sum(valuesDTO.getValue1(), valuesDTO.getValue2());
    }

    @PutMapping
    public void savePracownik(@RequestBody PracownikDTO pracownikDTO){

        Pracownik pracownik = pracownikMapper.mapFromDTO(new Pracownik(),pracownikDTO);
        PracownikAdres pracownikAdres = pracownikAdresMapper.mapFromDTO(new PracownikAdres(),pracownikDTO);
        pracownikAdresRepository.save(pracownikAdres);
        pracownik.setPracownikAdres(pracownikAdres);
        pracownikRepository.save(pracownik);
    }
}
