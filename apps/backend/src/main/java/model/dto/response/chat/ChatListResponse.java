package model.dto.response.chat;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import model.enums.RoleName;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ChatListResponse {
   
    
    private Long id;
    private String sessionId;
    private String messageContent;

    private RoleName senderType;

   
    private LocalDateTime createdAt;

}
