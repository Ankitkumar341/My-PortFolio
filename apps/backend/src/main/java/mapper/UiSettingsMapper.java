package mapper;

import model.dto.reqeust.settings.UiSettingsUpdateRequest;
import model.dto.response.settings.UiSettingsResponse;
import model.entity.UiSettings;
import org.mapstruct.*;

@Mapper(
    componentModel = MappingConstants.ComponentModel.SPRING,
    unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface UiSettingsMapper {
    
    UiSettingsResponse toResponse(UiSettings settings);
    
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "user", ignore = true)
    void updateEntity(UiSettingsUpdateRequest request, @MappingTarget UiSettings settings);
}
