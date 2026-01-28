package model.dto.response.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

// Compact user info for list views
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserListResponse {
    
    private Long id;
    private String userName;
    private String email;
    private String fullName;
    private Boolean isActive;
    private LocalDateTime createdAt;
}
