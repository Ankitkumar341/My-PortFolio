package model.dto.reqeust.settings;

import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UiSettingsUpdateRequest {

    private Boolean darkMode;

    private Boolean animationEnabled;

    @Size(max = 50, message = "Layout preference cannot exceed 50 characters")
    private String layoutPreference;

    @Pattern(regexp = "^[a-z]{2}(-[A-Z]{2})?$", 
             message = "Language must be valid language code (e.g., en, en-US)")
    @Size(min = 2, max = 10, message = "Language code must be between 2 and 10 characters")
    private String language;
}
