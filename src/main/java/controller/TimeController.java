package controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/time")

public class TimeController {

    @Autowired


    @GetMapping ("/buscar")
    public ResponseEntity BuscarTimes(){}


    @PostMapping ("/adc")
    public ResponseEntity AdcTime(@ResponseBody @Valid DTO){}


    @PutMapping("/updt/{id}")
    public ResponseEntity UpdtTime(@PathVariable Long id, @ResponseBody @Valid DTO){}


    @DeleteMapping("dell/{id}")
    public ResponseEntity DellTime(@PathVariable Long id){}



}
