package edu.controller;
import edu.model.Band;
import edu.service.BandServiceImpl;
import edu.service.IBandService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/band")
@RequiredArgsConstructor
public class BandController {

    @Autowired
    final IBandService iBandService;

    @GetMapping("/getBand")
    public Band getBand() {
        return new Band(1, "One Direction", 1000, "Pop");
    }

    @PostMapping("/addBand")
    public void  addBand(@RequestBody Band band) {
        iBandService.addBand(band);
    }


}


