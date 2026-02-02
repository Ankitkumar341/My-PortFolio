package model.dto.response.project;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import model.enums.ProjectStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;

// Compact project info for gallery/list views
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProjectListResponse {
    
    private Long id;
    private String title;
    private String description;
    private String imageUrl;
    private ProjectStatus status;
    private LocalDate startDate;
    private String clientName;
    private LocalDateTime createdAt;
}
