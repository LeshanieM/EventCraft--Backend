package edu.controller;
import edu.model.Band;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/band")
public class BandController {

    @GetMapping("/getBand")
    public Band getBand(){
        return new Band(1, "One Direction", 1000, "Pop");
    }
}
