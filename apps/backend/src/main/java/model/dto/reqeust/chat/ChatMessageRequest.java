package model.dto.reqeust.chat;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import model.enums.RoleName;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ChatMessageRequest {

    @NotBlank(message = "Session ID is required")
    @Size(max = 100, message = "Session ID cannot exceed 100 characters")
    private String sessionId;

    @Size(max = 1000, message = "Message content cannot exceed 1000 characters")
    private String messageContent;

    @NotNull(message = "Sender type is required")
    private RoleName senderType;

    @NotNull(message = "User ID is required")
    private Long userId;
}
