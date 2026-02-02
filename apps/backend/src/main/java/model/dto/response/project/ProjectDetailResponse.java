package model.dto.response.project;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import model.dto.response.client.ClientResponse;
import model.dto.response.skill.SkillResponse;
import model.enums.PaymentStatus;
import model.enums.ProjectStatus;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

// Extended project details with nested client and skills
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProjectDetailResponse {
    
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
    private ClientResponse client;
    private List<SkillResponse> skills;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
