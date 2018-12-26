package pl.StrongSoft.jpa.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.StrongSoft.data.domain.PracownikAdres;
import pl.StrongSoft.data.service.PracownikAdresRepository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

@RequestMapping(value = "/pracownikadres")
@RestController
public class PracownikAdresREST {

    @Autowired
    PracownikAdresRepository pracownikAdresRepository;

    @GetMapping("/all")
    public List<PracownikAdres> getPracownikAdresList(){

        Stream<PracownikAdres> stream = StreamSupport.stream(pracownikAdresRepository.findAll().spliterator(),false);

        return stream.collect(Collectors.toList());
    }
}
