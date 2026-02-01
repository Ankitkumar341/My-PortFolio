package mapper;

import model.dto.response.role.RoleResponse;
import model.entity.Role;
import org.mapstruct.*;

import java.util.List;

@Mapper(
    componentModel = MappingConstants.ComponentModel.SPRING,
    unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface RoleMapper {
    
    RoleResponse toResponse(Role role);
    
    List<RoleResponse> toResponseList(List<Role> roles);
}
