package mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper {
    
    // UserDTO toDTO(User user);
    // User toEntity(UserDTO dto);
    // List<UserDTO> toDTOList(List<User> users);
    
}
