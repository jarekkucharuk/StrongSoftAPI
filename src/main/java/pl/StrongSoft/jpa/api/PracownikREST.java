package pl.StrongSoft.jpa.api;

import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.StrongSoft.data.domain.Pracownik;
import pl.StrongSoft.data.service.PracownikRepository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

@RequestMapping(value = "/pracownik")
@RestController
public class PracownikREST {

    @Autowired
    PracownikRepository pracownikRepository;

    @GetMapping("/all")
    public List<Pracownik> getPracownikList(){

        Stream<Pracownik> stream = StreamSupport.stream(pracownikRepository.findAll().spliterator(), false);

        return stream.collect(Collectors.toList());
    }

    @GetMapping("/pr/{id}")
    public Pracownik getPracownik(@PathVariable Integer id) throws NotFoundException{

        Pracownik pracownik= pracownikRepository.findById(id)
                .orElseThrow(()->new NotFoundException("Nie ma pracownika o id= "+id) );

        return pracownik;
    }
}
