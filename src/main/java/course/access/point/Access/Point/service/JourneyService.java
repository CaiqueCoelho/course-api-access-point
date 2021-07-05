package course.access.point.Access.Point.service;

import course.access.point.Access.Point.model.WorkJourney;
import course.access.point.Access.Point.repository.JourneyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JourneyService {

    private JourneyRepository journeyRepository;

    @Autowired
    public JourneyService(JourneyRepository journeyRepository) {
        this.journeyRepository = journeyRepository;
    }

    public WorkJourney save(WorkJourney workJourney){
        return journeyRepository.save(workJourney);
    }

    public List<WorkJourney> findAll() {
        return journeyRepository.findAll();
    }

    public Optional<WorkJourney> findByid(Long id) {
        return journeyRepository.findById(id);
    }

    public WorkJourney update(WorkJourney workJourney) {
        return journeyRepository.save(workJourney);
    }

    public void delete(Long id) {
        journeyRepository.deleteById(id);
    }
}
