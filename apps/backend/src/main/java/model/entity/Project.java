package model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import model.enums.EmploymentType;
import model.enums.PaymentStatus;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

    @Column(length = 500 , nullable = false , unique = true)
    private String title ;

    @Column(length = 500 )
    private String description ;

    private String thumbnailUrl ;
    private String liveDemoUrl ;


    private String sourceCodeUrl ;

    @Enumerated(EnumType.STRING)
    private PaymentStatus status ;

    @Enumerated(EnumType.STRING)
    private EmploymentType employmentType ;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client clientId ;

    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime created_At ;

    @ManyToMany(mappedBy = "projects")
    private List<Skill> skillList = new ArrayList<>();



}
