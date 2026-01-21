package mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface PastEmploymentMapper {
    
    // PastEmploymentDTO toDTO(PastEmployment employment);
    // PastEmployment toEntity(PastEmploymentDTO dto);
    // List<PastEmploymentDTO> toDTOList(List<PastEmployment> employments);
    
}
