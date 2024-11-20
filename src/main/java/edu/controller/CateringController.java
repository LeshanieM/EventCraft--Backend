package edu.controller;


import edu.model.Catering;
import edu.service.ICateringService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/catering")
@RequiredArgsConstructor
public class CateringController {

    @Autowired
    final ICateringService iCateringService;

    @GetMapping("/getAll")
    public List<Catering> getCatering() {
        return iCateringService.getAll();
    }

    @PostMapping("/addCatering")
    @ResponseStatus(HttpStatus.CREATED)
    public void  addCatering(@RequestBody Catering catering) {
        iCateringService.addCatering(catering);
    }

    @GetMapping("/searchById/{id}")
    public Catering getCateringById(@PathVariable Integer id){
        return iCateringService.searchCateringById(id);
    }

    @DeleteMapping("/deleteCateringById/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteCateringById(@PathVariable Integer id){
        iCateringService.deleteCateringById(id);
    }

    @PutMapping("/updateCatering")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateCatering(@RequestBody Catering catering){
        iCateringService.updateCateringById(catering);
    }
}
