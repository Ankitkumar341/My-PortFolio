package model.entity;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id ;

    @Column(nullable = false)
    private  String userName ;

    @Column(unique = true , nullable = false,length = 150)
    @Email
    private  String email ;

    private  String hashPassword ;

    @Column(length = 50)
    private  String fullName ;

    @Column(length = 500, nullable = true )
    private  String bio ;

    private  String profileImageUrl ;


    private  String contactNumber ;

    @CreationTimestamp
    private LocalDateTime created_At ;


    @ManyToMany  (cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
            name = "user_roles",
            joinColumns = @JoinColumn(name = "user_Id"),
            inverseJoinColumns = @JoinColumn(name ="role_Id")
    )
    private List<Role> roleList = new ArrayList<>();


    @OneToMany(mappedBy = "userId")
    private List<PastEmployment> pastEmploymentList = new ArrayList<>() ;


    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ChatMessage> chatMessages = new ArrayList<>();

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private UiSettings uiSettings ;

   @OneToMany(mappedBy="user", cascade = CascadeType.ALL, orphanRemoval = true)
   private List<Payment> payments = new ArrayList<>() ;


}
