package model.dto.reqeust.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

// Admin endpoint to create users directly
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserCreateRequest {

    @NotBlank(message = "Username required")
    @Size(min = 3, max = 50, message = "Username: 3-50 chars")
    private String userName;

    @NotBlank(message = "Email required")
    @Email(message = "Invalid email")
    private String email;

    @NotBlank(message = "Password required")
    @Size(min = 8, message = "Password min 8 chars")
    private String password;

    @Size(max = 100, message = "Full name max 100 chars")
    private String fullName;

    @Size(max = 1000, message = "Bio max 1000 chars")
    private String bio;

    // Optional - assign roles during creation
    private List<Long> roleIds;
}
