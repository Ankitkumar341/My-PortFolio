package mapper;

import model.dto.reqeust.chat.ChatMessageRequest;
import model.dto.response.chat.ChatListResponse;
import model.dto.response.chat.ChatMessageResponse;
import model.entity.ChatMessage;
import org.mapstruct.*;

import java.util.List;

@Mapper(
    componentModel = MappingConstants.ComponentModel.SPRING,
    unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface ChatMapper {
    
    @Mapping(target = "userId", source = "user.id")
    @Mapping(target = "userName", source = "user.userName")
    @Mapping(target = "message", source = "messageContent")
    @Mapping(target = "sender", source = "senderType")
    ChatMessageResponse toResponse(ChatMessage message);
    
    ChatListResponse toListResponse(ChatMessage message);
    
    List<ChatMessageResponse> toResponseList(List<ChatMessage> messages);
    
    List<ChatListResponse> toListResponseList(List<ChatMessage> messages);
 
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "user", ignore = true)
    @Mapping(target = "read", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    ChatMessage toEntity(ChatMessageRequest request);
}
