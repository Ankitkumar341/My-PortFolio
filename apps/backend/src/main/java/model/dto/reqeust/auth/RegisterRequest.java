package model.dto.reqeust.auth;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// Public signup endpoint
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {

    @NotBlank(message = "Username required")
    @Size(min = 3, max = 50, message = "Username: 3-50 chars")
    private String userName;

    @NotBlank(message = "Email required")
    @Email(message = "Invalid email")
    private String email;

    @NotBlank(message = "Password required")
    @Size(min = 8, message = "Min 8 chars")
    private String password;

    @NotBlank(message = "Full name required")
    private String fullName;
}
