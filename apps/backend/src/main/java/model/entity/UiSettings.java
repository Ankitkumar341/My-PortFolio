package model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "ui_settings",
    indexes = @Index(name = "idx_ui_settings_user", columnList = "user_id")
)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UiSettings {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", unique = true, nullable = false, foreignKey = @ForeignKey(name = "fk_ui_settings_user"))
    private User user;

    @Column(name = "dark_mode")
    private Boolean darkMode = false;

    @Column(name = "animation_enabled")
    private Boolean animationEnabled = true;

    @Column(name = "layout_preference", length = 50)
    private String layoutPreference = "default";

    @Column(name = "language", length = 10, nullable = false)
    private String language = "en";

    @Override
    public String toString() {
        return "UiSettings{" +
                "id=" + id +
                ", darkMode=" + darkMode +
                ", animationEnabled=" + animationEnabled +
                ", layoutPreference='" + layoutPreference + '\'' +
                ", language='" + language + '\'' +
                '}';
    }
}
