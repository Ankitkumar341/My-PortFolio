package mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ProjectMapper {
    
    // ProjectDTO toDTO(Project project);
    // Project toEntity(ProjectDTO dto);
    // List<ProjectDTO> toDTOList(List<Project> projects);
    
}
