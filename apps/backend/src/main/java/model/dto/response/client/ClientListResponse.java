package model.dto.response.client;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

// Minimal client info for list views
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ClientListResponse {
    
    private Long id;
    private String name;
    private String company;
    private String email;
    private Integer projectCount;
    private LocalDateTime createdAt;
}
