package model.dto.response.auth;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// Returned after successful login/register with JWT token
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AuthResponse {

    private Long id;
    private String userName;
    private String email;
    private String fullName;
    private LocalDateTime createdAt;

    private String token;
    private String tokenType = "Bearer";



}
