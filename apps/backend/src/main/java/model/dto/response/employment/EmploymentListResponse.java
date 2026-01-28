package model.dto.response.employment;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import model.enums.EmploymentType;

import java.time.LocalDate;

// Brief work history for resume/timeline
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmploymentListResponse {
    
    private Long id;
    private String companyName;
    private String role;
    private EmploymentType employmentType;
    private LocalDate startDate;
    private LocalDate endDate;
    private Boolean isCurrent;
}
