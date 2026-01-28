package model.dto.response.role;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import model.enums.RoleName;

import java.time.LocalDateTime;

// User role info for RBAC
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RoleResponse {

    private Long id;
    private RoleName roleName;
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
