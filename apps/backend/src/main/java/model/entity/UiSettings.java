package model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "ui_settings")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UiSettings {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", unique = true)
    private User user;

    @Column(name = "dark_mode")
    private Boolean darkMode;

    @Column(name = "animation_enabled")
    private Boolean animationEnabled;

    @Column(name = "layout_preference", length = 50)
    private String layoutPreference;

    @Column(name = "language", length = 10, nullable = false)
    private String language;
}
