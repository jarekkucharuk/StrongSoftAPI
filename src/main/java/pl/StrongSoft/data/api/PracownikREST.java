package pl.StrongSoft.data.api;

import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.StrongSoft.data.jpa.domain.Pracownik;
import pl.StrongSoft.data.jpa.domain.PracownikAdres;
import pl.StrongSoft.data.service.PracownikAdresRepository;
import pl.StrongSoft.data.service.PracownikRepository;
import pl.StrongSoft.data.jpa.dto.PracownikAdresDTO;
import pl.StrongSoft.data.jpa.dto.PracownikDTO;
import pl.StrongSoft.data.jpa.domain.Values;
import pl.StrongSoft.data.jpa.mapper.PracownikAdresDtoMapper;
import pl.StrongSoft.data.jpa.mapper.PracownikAdresMapper;
import pl.StrongSoft.data.jpa.mapper.PracownikDtoMapper;
import pl.StrongSoft.data.jpa.mapper.PracownikMapper;

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
    @Autowired
    PracownikDtoMapper pracownikDtoMapper;
    @Autowired
    PracownikAdresDtoMapper pracownikAdresDtoMapper;

    @GetMapping("/all")
    public List<Pracownik> getPracownikList() {

        Stream<Pracownik> stream = StreamSupport.stream(pracownikRepository.findAll().spliterator(), false);

        return stream.collect(Collectors.toList());
    }

    @GetMapping("/one/{id}")
    public PracownikDTO getPracownik(@PathVariable Integer id) throws NotFoundException {

        Pracownik pracownik = pracownikRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Nie ma pracownika o id= " + id));

        PracownikAdres pracownikAdres = pracownik.getPracownikAdres();

        PracownikDTO pracownikDTO = pracownikDtoMapper.mapToDTO(new PracownikDTO(), pracownik);

        PracownikAdresDTO pracownikAdresDTO = pracownikAdresDtoMapper.mapToDTO(new PracownikAdresDTO(), pracownikAdres);

        pracownikDTO.setPracownikAdresDTO(pracownikAdresDTO);

        return pracownikDTO;
    }

    @PostMapping
    public Double getSum(@RequestBody Values values) {

        return (values.getValue1() + values.getValue2());
    }

    @PutMapping
    public void savePracownik(@RequestBody PracownikDTO pracownikDTO) {

        Pracownik pracownik = pracownikMapper.mapFromDTO(new Pracownik(), pracownikDTO);

        PracownikAdres pracownikAdres = pracownikAdresMapper.mapFromDTO(new PracownikAdres(), pracownikDTO);

        pracownikAdresRepository.save(pracownikAdres);

        pracownik.setPracownikAdres(pracownikAdres);

        pracownikRepository.save(pracownik);
    }
}
