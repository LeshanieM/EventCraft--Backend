package edu.controller;
import java.util.List;
import edu.service.HallServiceImpl;
import edu.model.Hall;
import edu.service.IHallService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hall")
@RequiredArgsConstructor
public class HallController {

    @Autowired
    final IHallService iHallService;

    @GetMapping("/getAll")
    public List<Hall> getHall() {
        return iHallService.getAll();
    }

    @PostMapping("/addHall")
    @ResponseStatus(HttpStatus.CREATED)
    public void  addHall(@RequestBody Hall hall) {
        iHallService.addHall(hall);
    }

    @GetMapping("/searchById/{id}")
    public Hall getHallById(@PathVariable Integer id){
        return iHallService.searchHallById(id);
    }

    @DeleteMapping("/deleteHallById/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteHallById(@PathVariable Integer id){
        iHallService.deleteHallById(id);
    }

    @PutMapping("/updateHall")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateHall(@RequestBody Hall hall){
        iHallService.updateHallById(hall);
    }

}





