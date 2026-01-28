package model.dto.reqeust.employment;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import model.enums.RoleName;

import java.time.LocalDate;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmploymentCreateRequest {

    @NotNull(message = "User ID is required")
    private Long userId;

    @NotNull(message = "Job role is required")
    private RoleName jobRole;

    @NotBlank(message = "Company name is required")
    @Size(min = 2, max = 100, message = "Company name  between 2 and 100 characters")
    private String companyName;

    private LocalDate startDate;

    private LocalDate endDate;

    @NotNull(message = "Is current field is required")
    private Boolean isCurrent = false;

    @Size(max = 1000, message = "Description cannot exceed 1000 characters")
    private String description;
}
