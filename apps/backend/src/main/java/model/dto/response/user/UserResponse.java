package model.dto.response.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import model.dto.response.role.RoleResponse;

import java.time.LocalDateTime;
import java.util.List;

// User profile data without sensitive info
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {
    
    private Long id;
    private String userName;
    private String email;
    private String fullName;
    private String profilePicture;
    private String bio;
    private String phoneNumber;
    private String address;
    private String website;
    private Boolean isActive;
    private List<RoleResponse> roles;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
