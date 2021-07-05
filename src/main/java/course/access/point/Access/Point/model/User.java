package course.access.point.Access.Point.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Audited
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    private UserCategory userCategory;

    private String name;

    @ManyToOne
    private Company company;

    @ManyToOne
    private AccessLevel accessLevel;

    @ManyToOne
    private WorkJourney workJourney;

    private BigDecimal tolerance;

    private LocalDateTime startJourney;

    private LocalDateTime endJourney;
}
