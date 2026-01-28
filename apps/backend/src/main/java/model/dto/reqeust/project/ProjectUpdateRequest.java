package model.dto.reqeust.project;

import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import model.enums.EmploymentType;
import model.enums.PaymentStatus;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProjectUpdateRequest {

    @Size(min = 3, max = 200, message = "between 3 and 200 characters")
    private String title;

    @Size(max = 2000, message = "maximum exceed 2000 characters")
    private String description;

    @Pattern(regexp = "^(https?://)?([\\da-z.-]+)\\.([a-z.]{2,6})([/\\w .-]*)*/?$", 
             message = "Thumbnail URL must be a valid URL")
    @Size(max = 500, message = "Thumbnail URL cannot exceed 500 characters")
    private String thumbnailUrl;

    @Pattern(regexp = "^(https?://)?([\\da-z.-]+)\\.([a-z.]{2,6})([/\\w .-]*)*/?$", 
             message = "Live demo URL must be a valid URL")
    @Size(max = 500, message = "Live demo URL cannot exceed 500 characters")
    private String liveDemoUrl;

    @Pattern(regexp = "^(https?://)?([\\da-z.-]+)\\.([a-z.]{2,6})([/\\w .-]*)*/?$", 
             message = "Source code URL must be a valid URL")
    @Size(max = 500, message = "Source code URL cannot exceed 500 characters")
    private String sourceCodeUrl;

    private PaymentStatus status;

    private EmploymentType employmentType;

    private Long clientId;

    private List<Long> skillIds;
}
