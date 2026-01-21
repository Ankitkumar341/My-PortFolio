package mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface RoleMapper {
    
    // RoleDTO toDTO(Role role);
    // Role toEntity(RoleDTO dto);
    // List<RoleDTO> toDTOList(List<Role> roles);
    
}
