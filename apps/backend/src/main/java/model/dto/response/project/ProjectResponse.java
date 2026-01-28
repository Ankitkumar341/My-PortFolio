package model.dto.response.project;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import model.dto.response.skill.SkillResponse;
import model.enums.PaymentStatus;
import model.enums.ProjectStatus;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

// Full project details with skills and client
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProjectResponse {
    
    private Long id;
    private String title;
    private String description;
    private String imageUrl;
    private String liveUrl;
    private String githubUrl;
    private ProjectStatus status;
    private PaymentStatus paymentStatus;
    private BigDecimal budget;
    private LocalDate startDate;
    private LocalDate endDate;
    private Long clientId;
    private String clientName;
    private List<SkillResponse> skills;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
