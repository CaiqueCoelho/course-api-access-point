package course.access.point.Access.Point.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Builder
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Audited
public class Movement {

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Embeddable
    public class MovementId implements Serializable {
        private long movementId;
        private long userId;
    }

    @EmbeddedId
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private MovementId id;

    private LocalDateTime entryDate;

    private LocalDateTime outDate;

    private BigDecimal period;

    @ManyToOne
    private Occurrence occurrence;

    @ManyToOne
    private Calendar calendar;
}
