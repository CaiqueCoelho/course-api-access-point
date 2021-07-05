package course.access.point.Access.Point.repository;

import course.access.point.Access.Point.model.WorkJourney;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JourneyRepository extends JpaRepository<WorkJourney, Long> {
}
