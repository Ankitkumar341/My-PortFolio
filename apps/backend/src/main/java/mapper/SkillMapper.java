package mapper;

import model.dto.reqeust.skill.SkillCreateRequest;
import model.dto.reqeust.skill.SkillUpdateRequest;
import model.dto.response.skill.SkillListResponse;
import model.dto.response.skill.SkillResponse;
import model.entity.Skill;
import org.mapstruct.*;

import java.util.List;

@Mapper(
    componentModel = MappingConstants.ComponentModel.SPRING,
    unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface SkillMapper {
    

    @Mapping(target = "projectCount", expression = "java(skill.getProjects() != null ? skill.getProjects().size() : 0)")
    SkillResponse toResponse(Skill skill);
    
    SkillListResponse toListResponse(Skill skill);
    
    List<SkillResponse> toResponseList(List<Skill> skills);
    List<SkillListResponse> toListResponseList(List<Skill> skills);
    
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "projects", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    Skill toEntity(SkillCreateRequest request);
    
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "projects", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    void updateEntity(SkillUpdateRequest request, @MappingTarget Skill skill);
}
