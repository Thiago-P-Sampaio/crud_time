package controller;

import dto.Dto;
import entity.Entity;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import repository.Repository;

import java.util.Optional;

@RestController
@RequestMapping ("/time")

public class TimeController {

    @Autowired
    Repository repository;

    @GetMapping("/buscar")
    public ResponseEntity BuscarTimes() {
        var Buscar = repository.findAll();
        return ResponseEntity.ok().body(Buscar);
    }


    @PostMapping("/adc")
    public ResponseEntity AdcTime(@RequestBody @Valid Dto data) {
        Entity NovoTime = new Entity(data);
        repository.save(NovoTime);
        return ResponseEntity.ok().build();
    }


    @PutMapping("/updt/{id}")
    public ResponseEntity UpdtTime(@PathVariable Long id, @RequestBody @Valid Dto data) {
        Optional<Entity> existe = repository.findById(id);
        if (existe.isPresent()) {
            Entity updt = existe.get();
            if (data.nome() != null) {
                updt.setNome(data.nome());
                repository.save(updt);
            }
            if (data.liga() != null) {
                updt.setLiga(data.liga());
                repository.save(updt);
            }
            if (data.pais() != null) {
                updt.setPais(data.pais());
                repository.save(updt);
            }
            if (data.estadio() != null) {
                updt.setEstadio(data.estadio());
                repository.save(updt);
            }

            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

        }
    }


    @DeleteMapping("dell/{id}")
    public ResponseEntity DellTime(@PathVariable Long id) {
        Optional<Entity> existe = repository.findById(id);
        if (existe.isPresent()) {
            repository.deleteById(id);
            return ResponseEntity.ok().build();
        } else return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

}








