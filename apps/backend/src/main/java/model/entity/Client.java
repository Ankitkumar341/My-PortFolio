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
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;


    private String name ;

    @Column(unique = true, length = 200)
    private String logoUrl;

    private String websiteUrl ;

    @Column(length = 500,updatable = true)
    private String description ;

    @OneToMany(mappedBy = "clientId")
    private List<Project> projects = new ArrayList<>();

}
