package mapper;

import model.dto.reqeust.employment.EmploymentCreateRequest;
import model.dto.reqeust.employment.EmploymentUpdateRequest;
import model.dto.response.employment.EmploymentListResponse;
import model.dto.response.employment.EmploymentResponse;
import model.entity.PastEmployment;
import org.mapstruct.*;

import java.util.List;

@Mapper(
    componentModel = MappingConstants.ComponentModel.SPRING,
    unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface PastEmploymentMapper {
    
    @Mapping(target = "userId", source = "user.id")
    @Mapping(target = "role", expression = "java(employment.getJobRole() != null ? employment.getJobRole().name() : null)")
    EmploymentResponse toResponse(PastEmployment employment);
    
    @Mapping(target = "role", expression = "java(employment.getJobRole() != null ? employment.getJobRole().name() : null)")
    EmploymentListResponse toListResponse(PastEmployment employment);
    
    List<EmploymentResponse> toResponseList(List<PastEmployment> employments);
    List<EmploymentListResponse> toListResponseList(List<PastEmployment> employments);
    
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "user", ignore = true)
    PastEmployment toEntity(EmploymentCreateRequest request);
    
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "user", ignore = true)
    void updateEntity(EmploymentUpdateRequest request, @MappingTarget PastEmployment employment);
}
