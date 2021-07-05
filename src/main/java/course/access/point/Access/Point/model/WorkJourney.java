package course.access.point.Access.Point.model;

import lombok.*;
import org.hibernate.envers.Audited;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Audited
// @Getter
// @Setter
// @EqualsAndHashCode
public class WorkJourney {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String description;
}
