package model.dto.response.client;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

// Client details including project count
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ClientResponse {
    
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String company;
    private String website;
    private String address;
    private Integer projectCount;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
