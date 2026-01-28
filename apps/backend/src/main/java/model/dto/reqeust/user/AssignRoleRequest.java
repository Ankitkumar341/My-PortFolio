package model.dto.reqeust.user;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AssignRoleRequest {
    
    @NotNull(message = "User ID required")
    private Long userId;
    
    // Assign/update roles for a user
    @NotEmpty(message = "At least one role required")
    private List<Long> roleIds;
}
