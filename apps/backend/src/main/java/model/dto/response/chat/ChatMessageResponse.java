package model.dto.response.chat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import model.enums.RoleName;

import java.time.LocalDateTime;

// Chat message with sender info
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ChatMessageResponse {
    
    private Long id;
    private String message;
    private String sessionId;
    private RoleName sender;
    private Boolean isRead;
    private Long userId;
    private String userName;
    private LocalDateTime createdAt;
}
