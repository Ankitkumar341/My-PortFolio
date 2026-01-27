package model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "skills",
    uniqueConstraints = @UniqueConstraint(name = "uk_skill_name", columnNames = "name"),
    indexes = {
        @Index(name = "idx_skill_name", columnList = "name"),
        @Index(name = "idx_skill_category", columnList = "category")
    }
)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 50)
    private String name;

    @Column(nullable = false, length = 50)
    private String category;

    @Column(name = "proficiency_level")
    private Integer proficiencyLevel;

    @Column(name = "icon_url", length = 500)
    private String iconUrl;

    @CreationTimestamp
    @Column(name = "created_at", updatable = false, nullable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "skill_projects",
        joinColumns = @JoinColumn(name = "skill_id", foreignKey = @ForeignKey(name = "fk_skill_project_skill")),
        inverseJoinColumns = @JoinColumn(name = "project_id", foreignKey = @ForeignKey(name = "fk_skill_project_project"))
    )
    private List<Project> projects = new ArrayList<>();

    @Override
    public String toString() {
        return "Skill{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", proficiencyLevel=" + proficiencyLevel +
                '}';
    }
}
