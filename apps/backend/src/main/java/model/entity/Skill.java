package model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;


    private  String name  ;

    private String category ;

    @Column(name = "proficiency_level", nullable = true)
    private Integer proficiencyLevel ;

    @Column(name = "icon_url", length = 500, nullable = true)
    private String iconUrl;

    @ManyToMany
    @JoinTable(
    name = "skill_projects",
    joinColumns = @JoinColumn(name = "skill_id"),
    inverseJoinColumns = @JoinColumn(name = "project_id")
)
    private List<Project> projects = new ArrayList<>();
}
