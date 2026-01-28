package model.dto.reqeust.skill;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
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
public class SkillUpdateRequest {

    @Size(min = 2, max = 50, message = " name must be  2 and 50 characters")
    private String name;

    @Size(min = 2, max = 50, message = "Category must be 2 and 50 characters")
    private String category;

    @Min(value = 1, message = "Proficiency level must be at least 1")
    @Max(value = 10, message = "Proficiency level cannot exceed 10")
    private Integer proficiencyLevel;

    @Pattern(regexp = "^(https?://)?([\\da-z.-]+)\\.([a-z.]{2,6})([/\\w .-]*)*/?$", 
             message = "Icon URL must be a valid URL")
    @Size(max = 500, message = "Icon URL cannot exceed 500 characters")
    private String iconUrl;
}
