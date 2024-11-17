package edu.controller;
import edu.model.Band;
import java.util.List;
import edu.service.BandServiceImpl;
import edu.service.IBandService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/band")
@RequiredArgsConstructor
public class BandController {

    @Autowired
    final IBandService iBandService;

    @GetMapping("/getAll")
    public List<Band> getBand() {
        return iBandService.getAll();
    }

    @PostMapping("/addBand")
    @ResponseStatus(HttpStatus.CREATED)
    public void  addBand(@RequestBody Band band) {
        iBandService.addBand(band);
    }

    @GetMapping("/searchById/{id}")
    public Band getBandById(@PathVariable Integer id){
       return iBandService.searchBandById(id);
    }

    @DeleteMapping("/deleteBandById/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteBandById(@PathVariable Integer id){
        iBandService.deleteBandById(id);
    }

    @PutMapping("/updateBand")
    public void updateBand(@RequestBody Band band){
        iBandService.updateBandById(band);
    }

}


