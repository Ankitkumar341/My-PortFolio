package model.dto.response.settings;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// User's UI preferences
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UiSettingsResponse {
    
    private Long id;
    private Boolean darkMode;
    private Boolean notifications;
    private String language;
    private String layoutPreference ;
}
