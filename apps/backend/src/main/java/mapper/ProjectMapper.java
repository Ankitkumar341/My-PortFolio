package mapper;

import model.dto.reqeust.project.ProjectCreateRequest;
import model.dto.reqeust.project.ProjectUpdateRequest;
import model.dto.response.project.ProjectDetailResponse;
import model.dto.response.project.ProjectListResponse;
import model.dto.response.project.ProjectResponse;
import model.entity.Project;
import org.mapstruct.*;

import java.util.List;

@Mapper(
    componentModel = MappingConstants.ComponentModel.SPRING,
    uses = {SkillMapper.class, ClientMapper.class},
    unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface ProjectMapper {
    
    @Mapping(target = "clientId", source = "client.id")
    @Mapping(target = "clientName", source = "client.name")
    @Mapping(target = "imageUrl", source = "thumbnailUrl")
    @Mapping(target = "liveUrl", source = "liveDemoUrl")
    @Mapping(target = "githubUrl", source = "sourceCodeUrl")
    @Mapping(target = "status", constant = "ACTIVE")
    @Mapping(target = "paymentStatus", source = "status")
    ProjectResponse toResponse(Project project);

    @Mapping(target = "clientName", source = "client.name")
    @Mapping(target = "imageUrl", source = "thumbnailUrl")
    @Mapping(target = "status", constant = "ACTIVE")
    ProjectListResponse toListResponse(Project project);

    @Mapping(target = "imageUrl", source = "thumbnailUrl")
    @Mapping(target = "liveUrl", source = "liveDemoUrl")
    @Mapping(target = "githubUrl", source = "sourceCodeUrl")
    @Mapping(target = "status", constant = "ACTIVE")
    @Mapping(target = "paymentStatus", source = "status")
    ProjectDetailResponse toDetailResponse(Project project);
    
    List<ProjectResponse> toResponseList(List<Project> projects);
    List<ProjectListResponse> toListResponseList(List<Project> projects);
    
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "client", ignore = true)
    @Mapping(target = "skills", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    Project toEntity(ProjectCreateRequest request);
    
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "client", ignore = true)
    @Mapping(target = "skills", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    void updateEntity(ProjectUpdateRequest request, @MappingTarget Project project);
}
