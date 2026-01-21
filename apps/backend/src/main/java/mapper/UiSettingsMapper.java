package mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UiSettingsMapper {
    
    // UiSettingsDTO toDTO(UiSettings settings);
    // UiSettings toEntity(UiSettingsDTO dto);
    
}
