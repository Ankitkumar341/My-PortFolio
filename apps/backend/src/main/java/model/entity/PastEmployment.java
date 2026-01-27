package model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import model.enums.RoleName;

import java.time.LocalDate;


@Entity
@Table(name = "past_employments",
    indexes = {
        @Index(name = "idx_employment_user", columnList = "user_id"),
        @Index(name = "idx_employment_company", columnList = "company_name"),
        @Index(name = "idx_employment_current", columnList = "is_current")
    }
)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PastEmployment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false, foreignKey = @ForeignKey(name = "fk_employment_user"))
    private User user;

    @Enumerated(EnumType.STRING)
    @Column(name = "job_role", nullable = false, length = 20)
    private RoleName jobRole;

    @Column(name = "company_name", nullable = false, length = 100)
    private String companyName;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;

    @Column(name = "is_current", nullable = false)
    private Boolean isCurrent = false;

    @Column(length = 1000)
    private String description;

    @Override
    public String toString() {
        return "PastEmployment{" +
                "id=" + id +
                ", jobRole=" + jobRole +
                ", companyName='" + companyName + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", isCurrent=" + isCurrent +
                '}';
    }
}
