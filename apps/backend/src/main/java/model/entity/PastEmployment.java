package model.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import model.enums.RoleName;

import java.time.LocalDate;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PastEmployment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User userId ;

    @Enumerated(EnumType.STRING)
    private RoleName jobRole;

    @Column(nullable = false)
    private String companyName ;

    @CreatedDate
    private LocalDate startDate ;

    @UpdateTimestamp
    private LocalDate endDate ;

    @Column(nullable = false)
    private Boolean isCurrent ;

    @Column(length = 500 , updatable = true)
    private String descriptions ;

}
