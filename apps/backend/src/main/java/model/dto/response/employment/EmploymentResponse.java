package model.dto.response.employment;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import model.enums.EmploymentType;

import java.time.LocalDate;
import java.time.LocalDateTime;

// Past work history entry
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmploymentResponse {
    
    private Long id;
    private String companyName;
    private String role;
    private String description;
    private EmploymentType employmentType;
    private LocalDate startDate;
    private LocalDate endDate;
    private Boolean isCurrent;
    private Long userId;
    private LocalDateTime createdAt;
}
