package model.dto.reqeust.employment;

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
public class EmploymentUpdateRequest {

    private RoleName jobRole;

    @Size(min = 2, max = 100, message = "Company name between 2 and 100 characters")
    private String companyName;

    private LocalDate startDate;

    private LocalDate endDate;

    private Boolean isCurrent;

    @Size(max = 1000, message = "Description cannot exceed 1000 characters")
    private String description;
}
