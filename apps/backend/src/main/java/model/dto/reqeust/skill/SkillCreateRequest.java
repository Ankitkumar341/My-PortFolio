package model.dto.reqeust.skill;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SkillCreateRequest {

    @NotBlank(message = "Skill name is required")
    @Size(min = 2, max = 50, message = "Skill name between 2 and 50 characters")
    private String name;

    @NotBlank(message = "Category is required")
    @Size(min = 2, max = 50, message = "Category between 2 and 50 characters")
    private String category;

    @Min(value = 1, message = "Proficiency level at least 1")
    @Max(value = 10, message = "Proficiency level cannot exceed 10")
    private Integer proficiencyLevel;

    @Pattern(regexp = "^(https?://)?([\\da-z.-]+)\\.([a-z.]{2,6})([/\\w .-]*)*/?$", 
             message = "Icon URL a valid URL")
    @Size(max = 500, message = "Icon URL cannot exceed 500 characters")
    private String iconUrl;
}
