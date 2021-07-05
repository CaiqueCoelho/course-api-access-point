package course.access.point.Access.Point.controller;

import course.access.point.Access.Point.model.WorkJourney;
import course.access.point.Access.Point.service.JourneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/journey")
public class WorkJourneyController {

    private JourneyService journeyService;

    @Autowired
    public WorkJourneyController(JourneyService journeyService) {
        this.journeyService = journeyService;
    }

    @PostMapping
    public WorkJourney createJourney(@RequestBody WorkJourney workJourney){
        return journeyService.save(workJourney);
    }

    @GetMapping
    public List<WorkJourney> getJourneyList(){
        return journeyService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<WorkJourney> findById(@PathVariable Long id) throws NoSuchElementException {
        return ResponseEntity.ok(journeyService.findByid(id).orElseThrow(() -> new NoSuchElementException("Journey not found for id: " + id)));
    }

    @PutMapping
    public WorkJourney updateJourney(@RequestBody WorkJourney workJourney){
        return journeyService.update(workJourney);
    }

    @DeleteMapping("/{id}")
    public void deletById(@PathVariable Long id) {
        journeyService.delete(id);
    }
}
