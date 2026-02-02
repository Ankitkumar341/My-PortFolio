package model.dto.reqeust.auth;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ChangePasswordRequest {

    @NotBlank(message = "Current password required")
    private String oldPassword;

    @NotBlank(message = "New password required")
    @Size(min = 8, max = 100, message = "Password must be 8-100 chars")
    private String newPassword;

    @NotBlank(message = "Please confirm new password")
    private String confirmPassword;
}
