package model.dto.response.skill;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// Minimal skill info for chips/tags
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SkillListResponse {
    
    private Long id;
    private String name;
    private String category;
    private Integer proficiencyLevel;
    private String icon;
}
