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

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Audited
public class HoursBanks {

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Embeddable
    public class HoursBankId implements Serializable {
        private long bankHoursId;

        private long movementId;

        private long userId;
    }

    @EmbeddedId
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private HoursBankId id;

    private LocalDateTime workedDate;

    private BigDecimal hoursQuantity;

    private BigDecimal balanceHours;
}
