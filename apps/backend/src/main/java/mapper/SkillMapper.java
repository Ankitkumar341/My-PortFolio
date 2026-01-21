package mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface SkillMapper {
    
    // SkillDTO toDTO(Skill skill);
    // Skill toEntity(SkillDTO dto);
    // List<SkillDTO> toDTOList(List<Skill> skills);
    
}
